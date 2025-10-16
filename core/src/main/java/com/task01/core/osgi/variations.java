package com.task01.core.osgi;





import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Component(service = variations.class, enabled = true ,immediate=true)
@Designate(ocd = Remaining.class)
public class variations {

    private static final Logger LOG=LoggerFactory.getLogger(variations.class);

     private String UserName;

     private int  UserId;
 @Activate
public void activate(Remaining remain) {
    update(remain);
    LOG.info("Component activated.");
}

@Modified
public void modified(Remaining remain) {
    update(remain);
    LOG.info("Component modified.");
}

@Deactivate
public void deactivate(Remaining remain) {
    LOG.info("Component deactivated.");
}

  
   public void update(Remaining remain){
      this.UserName=remain.UserName();
      this.UserId=remain.userid();
      LOG.info("UserName: {}, UserId: {}", UserName, UserId);

      }
}




  





