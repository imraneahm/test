package com.example.jsff;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;

@ManagedBean
@RequestScoped
public class ValidatorBean implements Validator {
    private String inputValue;

    public boolean isTest() {
        return test;
    }

    public void setTest(boolean test) {
        this.test = test;
    }

    private boolean test = true ;

    public String getInputValue() {
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
    }

    public void submit() {
    }

    public String msg(){
        if (test==true ) return " " ;
        return " Parfait ";

    }

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        if (!inputValue.matches("^\\d{4}-\\d{2}-\\d{2}$")) {
            FacesMessage message = new FacesMessage("Le format de date n'est pas valide. Utilisez yyyy-MM-dd.");
            throw new ValidatorException(message);
        }
        test = false ;
    }
}
