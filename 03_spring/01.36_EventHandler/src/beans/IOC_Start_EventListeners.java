package beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class IOC_Start_EventListeners implements ApplicationListener<ContextStartedEvent> {

  @Override
  public void onApplicationEvent(ContextStartedEvent cse) {
    System.out.println("On IOC start event");
  }
}
