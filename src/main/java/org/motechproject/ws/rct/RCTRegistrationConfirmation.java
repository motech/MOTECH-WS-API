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

}
