package com.task01.core.schedulers;

import org.apache.sling.commons.scheduler.ScheduleOptions;
import org.apache.sling.commons.scheduler.Scheduler;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.task01.core.osgi.Immersion;


@Component(service =content.class,immediate=true)
@Designate(ocd =Immersion.class)
public class content implements Runnable {
   
    private static final Logger log=LoggerFactory.getLogger(Immersion.class);

    @Reference
    private Scheduler scheduler;

    public void Scheduler(Immersion immi){
        if(immi.enabled()){
        ScheduleOptions so=scheduler.EXPR(immi.getcornexpression());
        so.name(immi.getschedulename());
        so.canRunConcurrently(immi.iscanrun());
        }
    }  


  @Activate
  @Modified
  public void activate(Immersion immi){
    log.info("inside the activate");
  }
   @Deactivate
   public void deactivate(Immersion immi){
     log.info("CustomScheduler Job is Unscheduled...");
        scheduler.unschedule(immi.getschedulename());

    }
 @Override
   public void run() {
       log.info("CustomScheduler has been executed successfully...");
    }
}

       


