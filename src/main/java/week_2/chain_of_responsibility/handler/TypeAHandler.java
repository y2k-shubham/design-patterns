package week_2.chain_of_responsibility.handler;

import week_2.chain_of_responsibility.request.Request;
import week_2.chain_of_responsibility.request.RequestType;
import week_2.chain_of_responsibility.response.Response;
import week_2.chain_of_responsibility.response.TypePResponse;

public class TypeAHandler extends Handler {

    @Override
    protected boolean canHandle(Request request) {
        return request.getRequestType() == RequestType.TYPE_A;
    }

    @Override
    protected Response handle(Request request) {
        getLogger().info("Handling request");
        Response response = new TypePResponse(request.getPayload());
        return response;
    }
}
