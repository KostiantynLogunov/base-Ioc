package org.doit;

public class InternetMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Message received from the internet";
    }
}
