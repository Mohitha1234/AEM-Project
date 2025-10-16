package com.task01.core.osgi;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="text", description = "text config")
public @interface configuration {

    @AttributeDefinition(name="schedular name",
    description = "schedular name",
    type=AttributeType.STRING) public String getSchedularname() default "surge";

    @AttributeDefinition(name="cron expression",
    description = "schedular cron expression name",
    type=AttributeType.STRING) public String getcronexpression() default "surge soft";

    @AttributeDefinition(name="can run concurrent",
    description = "schedular name",
    type=AttributeType.BOOLEAN) public boolean iscanrun() default  true;

    @AttributeDefinition(name="enabled",
    description = "schedular name",
    type=AttributeType.BOOLEAN) public boolean isenabled() default  true;
}
