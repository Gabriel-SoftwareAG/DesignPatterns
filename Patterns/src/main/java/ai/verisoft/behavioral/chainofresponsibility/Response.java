package ai.verisoft.behavioral.chainofresponsibility;

public class Response {
    private final int statusCode;
    private final String body;

    // Constructor
    public Response(int statusCode, String body) {
        this.statusCode = statusCode;
        this.body = body;
    }

    // Getter for statusCode
    public int getStatusCode() {
        return statusCode;
    }

    // Getter for body
    public String getBody() {
        return body;
    }

    // Simplified toString for demonstration
    @Override
    public String toString() {
        return "Status Code: " + statusCode + ", Body: " + body;
    }
}

