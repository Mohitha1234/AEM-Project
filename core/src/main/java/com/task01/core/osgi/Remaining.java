package com.task01.core.osgi;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;



@ObjectClassDefinition(name = "himm",description = "iugc")
public @interface Remaining {
 @ AttributeDefinition(name = "UserName",
    description ="all about username",
    defaultValue ="reo",
    type = AttributeType.STRING,
    required=true)
    public String  UserName();

 @ AttributeDefinition(name = "UserId",
    description ="all about userid",
    defaultValue ="345609876",
    type = AttributeType.INTEGER,
    required=true)
    public int  userid();
}

  

