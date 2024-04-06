package ai.verisoft.behavioral;

import ai.verisoft.behavioral.chainofresponsibility.*;
import org.junit.jupiter.api.Test;

public class ChainOfResponsibilityTest {

    @Test
    public void chainOfResponsibilityTest(){
        // Set up the chain
        Handler authentication = new AuthenticationHandler();
        Handler logging = new LoggingHandler();
        Handler errorCodeChecking = new ErrorCodeHandler();

        authentication.setNextHandler(logging);
        logging.setNextHandler(errorCodeChecking);

        // Example request
        Request request = new Request("http://example.com/api/resource", "POST");
        request.setBody("{\"key\":\"value\"}");

        // Simulate a response (in real scenario, this would be the result of the API call)
        Response response = new Response(200, "{\"response\":\"data\"}");

        // Execute the chain for the request and simulated response
        authentication.handle(request, response);
    }
}
