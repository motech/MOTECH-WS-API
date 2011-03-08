package org.motechproject.ws.rct;

import org.motechproject.ws.Patient;

import java.util.ArrayList;
import java.util.List;

public class RCTRegistrationConfirmation {

    private Patient patient;
    private ControlGroup controlGroup;

    private List<String> errors = new ArrayList<String>();

    public RCTRegistrationConfirmation() {
    }

    public RCTRegistrationConfirmation(Patient patient, ControlGroup controlGroup) {
        this.patient = patient;
        this.controlGroup = controlGroup;
    }

    public boolean isATreatmentSubject() {
        return controlGroup.isTreatment();
    }

    public String toString() {
        StringBuilder message = new StringBuilder();
        if (null != patient) {
            message.append(patient.getPreferredName());
            message.append(" With MoTeCH ID ");
            message.append(patient.getMotechId());
            message.append(" has been successfully registered as ");
            message.append(controlGroup.value());
        }
        return message.toString();
    }

    public boolean isEmpty() {
        return patient == null || controlGroup == null;
    }

}
