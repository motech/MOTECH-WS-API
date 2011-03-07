package org.motechproject.ws.rct;

public enum ControlGroup {
    T(true,"TREATMENT") , C(false,"CONTROL")  ;
    private boolean isTreatment;
    private String value;

    private ControlGroup(boolean isTest,String value) {
        this.isTreatment = isTest;
        this.value =  value ;
    }

    public boolean isTreatment(){
        return isTreatment;
    }

    public String value() {
        return value;
    }
}
