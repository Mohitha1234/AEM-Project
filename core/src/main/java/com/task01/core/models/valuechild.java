package com.task01.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class valuechild {

    @ValueMapValue
    private String textfield1;

    @ValueMapValue
    private String datepicker;

    public String getTextfield1() {
        return textfield1;
    }

    public String getDatepicker() {
        return datepicker;
    }
}
