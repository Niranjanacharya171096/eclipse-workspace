package beans;

import java.util.Locale;
import org.springframework.context.MessageSource;

public class I18NBean {
private MessageSource messageSource;
public void setMessageSource(MessageSource messageSource) {
this.messageSource = messageSource;
}
public void displayMessage(){
System.out.println("Message :"+messageSource.getMessage("welcome", new Object[]{"zh", "CN"}, Locale.CHINA));
System.out.println("Message :"+messageSource.getMessage("welcome", new Object[]{"en", "US"}, Locale.US));
}
}