package org.motechproject.ws.rct;

import org.motechproject.ws.Patient;

public class MessageContent implements Content {

    private Patient patient;
    private ControlGroup controlGroup;

    public MessageContent(Patient patient, ControlGroup controlGroup) {
        this.patient = patient;
        this.controlGroup = controlGroup;
    }

    public String text() {
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

    public Boolean hasError() {
        return false;
    }
}
