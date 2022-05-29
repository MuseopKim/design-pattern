package chainofresponsibility;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {

    private final RequestHandler requestHandler;

    public void doWork() {
        Request request = new Request("request body");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }
}
