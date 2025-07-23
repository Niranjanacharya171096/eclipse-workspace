package test;

import beans.I18NBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args)throws Exception {
ApplicationContext context=new ClassPathXmlApplicationContext("resources/applicationContext.xml");
I18NBean bean = (I18NBean)context.getBean("i18nBean");
bean.displayMessage();
}
}