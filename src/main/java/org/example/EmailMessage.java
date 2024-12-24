package org.example;


public class EmailMessage {

    private String receiver;
    private String message;

    public EmailMessage(String message, String receiver) {
        this.message = message;
        this.receiver = receiver;
    }

    public EmailMessage() {
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
