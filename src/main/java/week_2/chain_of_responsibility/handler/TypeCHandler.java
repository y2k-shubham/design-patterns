package week_2.chain_of_responsibility.handler;

import week_2.chain_of_responsibility.request.Request;
import week_2.chain_of_responsibility.request.RequestType;
import week_2.chain_of_responsibility.response.Response;
import week_2.chain_of_responsibility.response.TypeRResponse;

public class TypeCHandler extends Handler {

    @Override
    protected boolean canHandle(Request request) {
        return request.getRequestType() == RequestType.TYPE_C;
    }

    @Override
    protected Response handle(Request request) {
        getLogger().info("Handling request");
        Response response = new TypeRResponse(request.getPayload());
        return response;
    }
}
