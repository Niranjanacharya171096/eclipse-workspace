package controller;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class FormValidator implements Validator {
  @Override
  public void validate(Object form, Errors err) {
    FormBean fb = (FormBean) form;
    
    if(fb.getName().equals(""))
      err.reject("name", "Name is required");
    if(fb.getEmail().equals(""))
      err.reject("email", "Email is required");
  }
  
  @Override
  public boolean supports(Class arg0) {
    // TODO Auto-generated method stub
    return true;
  }
}
