package com.task01.core.schedulers;

import java.lang.module.Configuration;

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
import com.task01.core.osgi.configuration;


@Component(service = custom.class,immediate = true)
@Designate(ocd = configuration.class)
public class custom implements Runnable{
     private static final Logger log = LoggerFactory.getLogger(custom.class);

    @Reference
    private Scheduler scheduler;

  public void schedular(configuration config){
    if(config.isenabled()){
        ScheduleOptions so=scheduler.EXPR(config.getcronexpression());
        so.name(config.getSchedularname());
        so.canRunConcurrently(config.iscanrun());

    }
  }

    @Activate
    @Modified
    public void activate(configuration config) {
        log.info("Inside the Activate Method of the CustomSchedular");
    }

    @Deactivate
    public void deactivate(configuration config) {
        log.info("CustomScheduler Job is Unscheduled...");
        scheduler.unschedule(config.getSchedularname());
    }

    @Override
    public void run() {
        log.info("CustomScheduler has been executed successfully...");
    }

}
