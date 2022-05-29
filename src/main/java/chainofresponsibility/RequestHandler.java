package chainofresponsibility;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class RequestHandler {

    private final RequestHandler nextHandler;

    public void handle(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
