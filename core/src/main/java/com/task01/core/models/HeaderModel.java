package com.task01.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderModel {

    @ValueMapValue
    private String path;

    @ValueMapValue
    private String text;

    @ValueMapValue
    private boolean enabled;

    @ChildResource(name = "multiField")
    private List<Resource> multiField;

    public String getPath() {
        return path;
    }

    public String getText() {
        return text;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public List<Item> getItems() {
        if (multiField == null) {
            return Collections.emptyList();
        }
        return multiField.stream()
                .map(resource -> new Item(
                        resource.getValueMap().get("itemText", String.class),
                        resource.getValueMap().get("itemDate", String.class)))
                .collect(Collectors.toList());
    }

    public static class Item {
        private final String itemText;
        private final String itemDate;

        public Item(String itemText, String itemDate) {
            this.itemText = itemText;
            this.itemDate = itemDate;
        }

        public String getItemText() {
            return itemText;
        }

        public String getItemDate() {
            return itemDate;
        }
    }
}
