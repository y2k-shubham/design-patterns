package week_2.chain_of_responsibility.handler;

import week_2.chain_of_responsibility.request.Request;
import week_2.chain_of_responsibility.response.Response;

public interface IHandler {

    public abstract void setNextHandler(IHandler nextHandler);

    public abstract Response handleRequest(Request request);
}
