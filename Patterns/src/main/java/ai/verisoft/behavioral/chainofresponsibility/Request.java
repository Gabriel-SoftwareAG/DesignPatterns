package ai.verisoft.behavioral.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class Request {
    private final String url;
    private final String method;
    private final Map<String, String> headers = new HashMap<>();
    private String body;

    // Constructors, getters and setters
    public Request(String url, String method) {
        this.url = url;
        this.method = method;
    }

    public void addHeader(String key, String value) {
        headers.put(key, value);
    }

    public void setBody(String body) {
        this.body = body;
    }

    // Simplified for demonstration
    @Override
    public String toString() {
        return "URL: " + url + ", Method: " + method + ", Headers: " + headers + ", Body: " + body;
    }
}



