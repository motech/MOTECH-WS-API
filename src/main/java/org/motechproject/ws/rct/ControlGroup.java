package org.motechproject.ws.rct;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public enum ControlGroup {
    T("TREATMENT") {

        @Override
        public boolean isTreatment() {
            return true;
        }},

    C("CONTROL") {

        @Override
        public boolean isTreatment() {
            return false;
        }},

    NONE("NONE") {

        @Override
        public boolean isTreatment() {
            throw new NotImplementedException();
        }
        @Override
        public Boolean isAssignable() {
            return Boolean.FALSE;
        }};

    private String value;

    private ControlGroup(String value) {
        this.value = value;
    }

    public abstract boolean isTreatment();

    public Boolean isAssignable() {
        return Boolean.TRUE;
    }

    public String value() {
        return value;
    }
}
