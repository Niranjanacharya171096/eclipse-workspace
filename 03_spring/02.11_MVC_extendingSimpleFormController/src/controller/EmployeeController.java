package controller;

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class EmployeeController extends SimpleFormController {

  public EmployeeController() {
    setCommandName("form");
    setCommandClass(FormBean.class);
    setValidator(new FormValidator());
    setFormView("index");
  }

  @Override
  protected ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, 
      Object cmd, BindException err) throws Exception {
    FormBean fb = (FormBean) cmd;
    System.out.println(fb.getName() + " " +fb.getEmail());
    return new ModelAndView("success"); 
  }  
}
