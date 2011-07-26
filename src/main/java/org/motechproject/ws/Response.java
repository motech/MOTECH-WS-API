package org.motechproject.ws;

public class Response {
    private String content;

    public Response(){}

    public Response(String content){
       this.content = content ;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
