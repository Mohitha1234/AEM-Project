package com.task01.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import java.util.ArrayList;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CarouselModel {

    @ChildResource(name = "slides")
    private List<Resource> slides;

    public List<Slide> getSlides() {
        List<Slide> slideList = new ArrayList<>();
        for (Resource slideResource : slides) {
            ValueMap slideProps = slideResource.getValueMap();
            String text = slideProps.get("text", String.class);
            String path = slideProps.get("path", String.class);

            List<SubItem> subItems = new ArrayList<>();
            for (Resource subItem : slideResource.getChild("subItems").getChildren()) {
                String subText = subItem.getValueMap().get("subText", String.class);
                subItems.add(new SubItem(subText));
            }

            slideList.add(new Slide(text, path, subItems));
        }
        return slideList;
    }

    public static class Slide {
        private final String text;
        private final String path;
        private final List<SubItem> subItems;

        public Slide(String text, String path, List<SubItem> subItems) {
            this.text = text;
            this.path = path;
            this.subItems = subItems;
        }

        public String getText() {
            return text;
        }

        public String getPath() {
            return path;
        }

        public List<SubItem> getSubItems() {
            return subItems;
        }
    }

    public static class SubItem {
        private final String subText;

        public SubItem(String subText) {
            this.subText = subText;
        }

        public String getSubText() {
            return subText;
        }
    }
}
