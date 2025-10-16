package com.task01.core.models;

import java.util.List;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = {Resource.class, SlingHttpServletRequest.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Sidebarr2 {
@ValueMapValue
private String desktopicon;
@ValueMapValue
private String mobileicon;
public String getDesktopicon() {
    return desktopicon;
}

public String getMobileicon() {
    return mobileicon;
}

public List<Sidebarr3> getMultifield1() {
    return multifield1;
}
@ChildResource
private List<Sidebarr3> multifield1;
}
