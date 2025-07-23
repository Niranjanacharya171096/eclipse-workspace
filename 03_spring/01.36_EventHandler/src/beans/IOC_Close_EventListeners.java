package beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class IOC_Close_EventListeners implements ApplicationListener<ContextClosedEvent> {

  @Override
  public void onApplicationEvent(ContextClosedEvent cce) {
    System.out.println("On IOC close event");
  }
}
