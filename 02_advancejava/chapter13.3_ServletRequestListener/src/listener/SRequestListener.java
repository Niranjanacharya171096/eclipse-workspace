package listener;

import javax.servlet.ServletRequestEvent; 
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class SRequestListener implements ServletRequestListener {
  public void requestInitialized(ServletRequestEvent sre)  { 
    System.out.println("For every Request: Init");      
  }
  public void requestDestroyed(ServletRequestEvent sre)  { 
    System.out.println("For Request Destroy: Destroy");
  }
}
