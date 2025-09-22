package com.task01.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ChildBookDetails {
    
    @ValueMapValue
    private String booksubject;

    @ValueMapValue
    private int booknumber;

    public String  getBooksubject() {
        return booksubject;
    }
       
    public int getBookNumber() {
        return booknumber;
    }

}
