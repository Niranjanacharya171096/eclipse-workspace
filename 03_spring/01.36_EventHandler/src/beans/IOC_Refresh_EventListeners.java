package beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class IOC_Refresh_EventListeners implements ApplicationListener<ContextRefreshedEvent> {

  @Override
  public void onApplicationEvent(ContextRefreshedEvent cre) {
    System.out.println("On IOC refresh event and container startup");
  }
}
