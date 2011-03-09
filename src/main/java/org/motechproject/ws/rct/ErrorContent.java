package org.motechproject.ws.rct;

public class ErrorContent implements Content {

    private String error;

    public ErrorContent(String error) {
        this.error = error;
    }

    public String text() {
        return error;
    }

    public Boolean hasError() {
        return true;
    }
}
