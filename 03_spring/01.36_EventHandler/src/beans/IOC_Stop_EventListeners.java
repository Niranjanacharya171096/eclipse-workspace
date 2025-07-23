package beans;

import org.springframework.context.ApplicationListener; 
import org.springframework.context.event.ContextStoppedEvent;

public class IOC_Stop_EventListeners implements ApplicationListener<ContextStoppedEvent> {

  @Override
  public void onApplicationEvent(ContextStoppedEvent cse) {
    System.out.println("On IOC stop event");
  }
}
