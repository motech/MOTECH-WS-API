package org.motechproject.ws;

public class Response {
    private String content;
    private Boolean success = Boolean.FALSE;

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

    public void markSuccess(){
        success = Boolean.TRUE;
    }

    public Boolean isSuccess(){
        return success ;
    }
}
