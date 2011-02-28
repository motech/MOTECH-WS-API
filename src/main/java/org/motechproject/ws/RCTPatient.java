package org.motechproject.ws;

public class RCTPatient {

    private Patient patient;
    private Boolean isTest;

    public RCTPatient(){}

    public RCTPatient(Patient patient, Boolean isTestPatient) {
        this.patient = patient;
        this.isTest = isTestPatient;
    }

}
