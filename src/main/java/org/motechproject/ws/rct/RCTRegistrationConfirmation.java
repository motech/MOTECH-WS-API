package org.motechproject.ws.rct;

import org.motechproject.ws.Patient;

public class RCTRegistrationConfirmation {

    private Patient patient;
    private ControlGroup controlGroup;

    public RCTRegistrationConfirmation(){}

    public RCTRegistrationConfirmation(Patient patient, ControlGroup controlGroup) {
        this.patient = patient;
        this.controlGroup = controlGroup;
    }

    public boolean isATestSubject(){
        return controlGroup.isTest();
    }

    public String toString(){
        StringBuilder message = new StringBuilder();

        message.append(patient.getPreferredName());
        message.append(" With MoTeCH ID ");
        message.append(patient.getMotechId());
        message.append(" has been successfully registered as ");
        message.append(controlGroup.value());

        return message.toString();
    }

}
