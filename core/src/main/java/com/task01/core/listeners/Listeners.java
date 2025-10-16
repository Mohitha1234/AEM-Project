package com.task01.core.listeners;


import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.PersistenceException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.replication.ReplicationAction;

@Component(service = EventHandler.class,immediate = true,
property = {
           EventConstants.EVENT_TOPIC+"="+ReplicationAction.EVENT_TOPIC,
           EventConstants.EVENT_FILTER+"=(&(type=ACTIVATE) (paths=html/content/task01/us/*))"

}
)
public class Listeners implements EventHandler{
      public static final Logger log = LoggerFactory.getLogger(Listeners.class);

      @Reference
      Dome dom;

    @Override
    public void handleEvent(Event event) {
        log.info("handle method is excued......");
        String property2 =(String) event.getProperty("paths");
         ResourceResolver resolver = dom.getResourceResolver();
          Resource resource=resolver.getResource(property2+"/jcr:content");
           ModifiableValueMap valueMap = resource.adaptTo(ModifiableValueMap.class);
           valueMap.put("activated", true);
           try {
            resolver.commit();
          } catch (PersistenceException e) {
         
            e.printStackTrace();
          }
          resolver.close();
    }
    
}


