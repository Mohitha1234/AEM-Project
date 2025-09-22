package com.task01.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ValueField {

    @ValueMapValue
    private String firstname;

    @ValueMapValue
    private String pathfield;

    @ValueMapValue
    private String checkbox;

    @ChildResource
    private List<valuechild> multifield;

    public String getFirstname() {
        return firstname;
    }

    public String getPathfield() {
        return pathfield;
    }

    public String getCheckbox() {
        return checkbox;
    }

    public List<valuechild> getMultifield() {
        return multifield;
    }
}
