package listener;

import javax.servlet.ServletContextEvent;  
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class SContextListener implements ServletContextListener {
  public void contextInitialized(ServletContextEvent sce)  { 
    System.out.println("on start server: context Init");
  }
  public void contextDestroyed(ServletContextEvent sce)  { 
    System.out.println("On stop/restart: context Destroy");
  }
}
