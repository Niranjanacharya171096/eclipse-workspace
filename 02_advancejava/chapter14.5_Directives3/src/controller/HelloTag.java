package controller;

import java.sql.*; 
import javax.servlet.jsp.*; 
import javax.servlet.jsp.tagext.*;

public class HelloTag extends TagSupport{
  private String name;
  
  public void setName (String name) {
    this.name=name;
  }
  public int doEndTag () throws JspException {
    try {
      pageContext.getOut ().print ("Hello..! "+name);
    }
    catch (Exception e) {
      throw new JspException (e.getMessage ());
    }
    return EVAL_PAGE;
  }
}
