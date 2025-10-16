package com.task01.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Sidebarr {
@ValueMapValue
private String logoPath;
@ValueMapValue
private String logoMobile;
@ValueMapValue
private String logoLink;
@ValueMapValue
private String enableSwitch;
@ValueMapValue
private String country;

public String getLogopath() {
    return logoPath;
}
public String getLogoMobile() {
    return logoMobile;
}
public String getLogoLink() {
    return logoLink;
}
public String getEnableSwitch() {
    return enableSwitch;
}
public String getCountry() {
    return country;
}

@ChildResource
private List<Sidebarr1> multifield;
@ChildResource
private List<Sidebarr2> multifield2;
public List<Sidebarr1> getMultifield() {
    return multifield;
}
public List<Sidebarr2> getMultifield2() {
    return multifield2;
}

}





