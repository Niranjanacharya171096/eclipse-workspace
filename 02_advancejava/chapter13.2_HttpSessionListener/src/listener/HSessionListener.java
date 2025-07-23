package listener;

import javax.servlet.annotation.WebListener;   
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class HSessionListener implements HttpSessionListener {
  public void sessionCreated(HttpSessionEvent se)  { 
    System.out.println("on Session creation");
  }
  public void sessionDestroyed(HttpSessionEvent se)  { 
    System.out.println("on Session invalidate");
  }
}
