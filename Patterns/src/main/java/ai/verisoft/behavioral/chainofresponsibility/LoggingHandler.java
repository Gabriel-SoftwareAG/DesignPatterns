package ai.verisoft.behavioral.chainofresponsibility;

// Handler for logging
public class LoggingHandler implements Handler {
    private Handler next;

    @Override
    public void setNextHandler(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Request request, Response response) {
        System.out.println("Request Details: " + request.toString());
        if (response != null) { // Check in case of preprocessing where response might not be available yet
            System.out.println("Response Details: " + response);
        }
        if (next != null) {
            next.handle(request, response);
        }
    }
}
