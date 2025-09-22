package com.task01.core.models;



import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;



@Model(adaptables=Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)

public class DemoModel implements Demo {
    @ValueMapValue
    private String text;
    @ValueMapValue
    private String textarea;
    @ValueMapValue
    private int number;
    @ValueMapValue
    private String[] books;

    @Override
    public String getArticleTitle() {
        return text;

    }
    @ChildResource
    public List<ChildBookDetails> bookdetailswithmap;




    @Override
    public String getArticleDescription() { 
    
        return textarea;
    }
    @Override
    public int getArticleNumber() {
        return number;
    }
    @Override
    public String[] getBookNames() {
        return books;
    }
   @Override
   public List<ChildBookDetails> getCompleteBookdetails(){
    return bookdetailswithmap;
   }

}
