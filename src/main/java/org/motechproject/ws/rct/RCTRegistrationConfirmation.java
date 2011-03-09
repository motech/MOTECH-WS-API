package org.motechproject.ws.rct;

public class RCTRegistrationConfirmation {
    private Content content;


    public RCTRegistrationConfirmation() {
    }

    public RCTRegistrationConfirmation(Content content) {
        this.content = content;
    }

    public Boolean hasErrorContent() {
        return content.hasError();
    }

    public String content() {
        return content.text();
    }

    @Override
    public String toString() {
        return content();

    }
}
