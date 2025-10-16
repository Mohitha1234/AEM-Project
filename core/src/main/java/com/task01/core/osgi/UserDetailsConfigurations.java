
package com.task01.core.osgi;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="jhu",description = "jgyedg")
public @interface UserDetailsConfigurations {
    @AttributeDefinition(name = " UserName",
    description = "about user Description"
    ,defaultValue = "reo",
    type = AttributeType.STRING,
    required = true)
    public String userName();

    @AttributeDefinition(name = " UserID",
    description = "about userId Description"
    ,defaultValue = "1011",
    type = AttributeType.INTEGER,
    required = true)
    public int userId();

}
