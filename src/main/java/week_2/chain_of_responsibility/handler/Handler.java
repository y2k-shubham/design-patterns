package week_2.chain_of_responsibility.handler;

import week_2.chain_of_responsibility.request.Request;
import week_2.chain_of_responsibility.response.Response;

import java.util.logging.Logger;

public abstract class Handler implements IHandler {

    private IHandler nextHandler;
    private Logger logger;

    public Handler() {
        this.nextHandler = null;
        this.logger = Logger.getLogger(this.getClass().getSimpleName());
    }

    @Override
    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    private boolean hasNextHandler() {
        return this.nextHandler != null;
    }

    public Logger getLogger() {
        return logger;
    }

    @Override
    public Response handleRequest(Request request) {
        System.out.println("Received request " + request);
        if (canHandle(request)) {
            return handle(request);
        } else if (hasNextHandler()) {
            this.logger.info("Passing request to nextHandler");
            return this.nextHandler.handleRequest(request);
        } else {
            throw new UnsupportedOperationException("Can't find suitable handler for given Request");
        }
    }

    protected abstract boolean canHandle(Request request);

    protected abstract Response handle(Request request);
}
