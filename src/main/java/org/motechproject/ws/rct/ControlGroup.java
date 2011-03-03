package org.motechproject.ws.rct;

public enum ControlGroup {
    T(true) , C(false)  ;
    private boolean isTest;

    private ControlGroup(boolean isTest) {
        this.isTest = isTest;
    }

    public boolean isTest(){
        return isTest ;
    }
}
