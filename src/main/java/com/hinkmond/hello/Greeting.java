package com.hinkmond.hello;

public class Greeting {

    private final long instanceID;
    private final String instanceContent;
    private final String greetingMessage;

    public Greeting(long id, String content, String msg) {
        this.instanceID = id;
        this.instanceContent = content;
        this.greetingMessage = msg;
    }

    public long getId() {
        return instanceID;
    }

    public String getContent() {
        return instanceContent;
    }

    public String getGreetingMessage() { return greetingMessage;}
}