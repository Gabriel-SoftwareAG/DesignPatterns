package ai.verisoft.behavioral.chainofresponsibility;

// Handler for checking error codes
public class ErrorCodeHandler implements Handler {
    private Handler next;

    @Override
    public void setNextHandler(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Request request, Response response) {
        if (response != null && response.getStatusCode() >= 400) {
            System.out.println("Error Response Received: " + response);
            // Handle error (log, throw exception, etc.)
        }
        if (next != null) {
            next.handle(request, response);
        }
    }
}
