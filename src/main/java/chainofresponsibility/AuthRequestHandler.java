package chainofresponsibility;

public class AuthRequestHandler extends RequestHandler{

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("Authenticated?");
        super.handle(request);
    }
}
