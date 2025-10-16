package com.task01.core.osgi;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
;

@Component(service = UserDetails.class,enabled = true,immediate=true)
@Designate(ocd=UserDetailsConfigurations.class)
public class UserDetails {


   private static final Logger LOG=LoggerFactory.getLogger("UserDetails.class");

    private String UserName;

    private int UserId;

    
    @Activate
      public void activate(UserDetailsConfigurations config){
         update(config);
         LOG.info("Data coming UserDetails class");

      }
       @Deactivate
      public void deactive(UserDetailsConfigurations config){
                    LOG.info("Data coming UserDetails class deactivate");
      }

       @Modified
      public void modified(UserDetailsConfigurations config){

                 LOG.info("Data coming UserDetails class modified");
      }
      public void update(UserDetailsConfigurations config)
      {
      this.UserName=config.userName();
      this.UserId=config.userId();
      LOG.info(UserName,UserId);
      }


}
