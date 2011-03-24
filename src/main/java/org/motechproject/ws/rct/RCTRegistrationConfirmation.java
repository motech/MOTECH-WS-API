package org.motechproject.ws.rct;

public class RCTRegistrationConfirmation {

    private String text;

    private Boolean errors;

    public RCTRegistrationConfirmation() {
        
    }

    public RCTRegistrationConfirmation(String text, Boolean errors){
        this.text = text;
        this.errors = errors;
    }

    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public Boolean getErrors() {
        return errors;
    }

    public void setErrors(Boolean errors) {
        this.errors = errors;
    }
}
