package com.task01.core.osgi;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "link",description = "about work")
public @interface Immersion {

    @AttributeDefinition(name ="Schedular name",
    description = "scheduler name",
    type = AttributeType.STRING)public String getschedulename() default "surge";
     
        @AttributeDefinition(name ="Corn Expression",
    description = "Corn Expression name",
    type = AttributeType.STRING)public String getcornexpression() default "surge soft" ;
     
       @AttributeDefinition(name ="can run concurrent",
    description = "schedular concurrent",
    type = AttributeType.BOOLEAN)public boolean iscanrun () default true;
     
       @AttributeDefinition(name ="Enabled",
    description = "schedular enabled",
    type = AttributeType.BOOLEAN)public boolean enabled() default true;
   
     

}
