package com.task01.core.models;



import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;


@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class card {
    @ChildResource(name="multifield")
    private List<pen> multifield1;

    public List<pen> getMultifield() {
        return multifield1;
    }
    


}
