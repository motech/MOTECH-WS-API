package org.motechproject.ws.rct;

public enum ControlGroup {
    T(true,"TEST") , C(false,"CONTROL")  ;
    private boolean isTest;
    private String value;

    private ControlGroup(boolean isTest,String value) {
        this.isTest = isTest;
        this.value =  value ;
    }

    public boolean isTest(){
        return isTest ;
    }

    public String value() {
        return value;
    }
}
