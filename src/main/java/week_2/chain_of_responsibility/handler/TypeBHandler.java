package week_2.chain_of_responsibility.handler;

import week_2.chain_of_responsibility.request.Request;
import week_2.chain_of_responsibility.request.RequestType;
import week_2.chain_of_responsibility.response.Response;
import week_2.chain_of_responsibility.response.TypeQResponse;

public class TypeBHandler extends Handler {

    @Override
    protected boolean canHandle(Request request) {
        return request.getRequestType() == RequestType.TYPE_B;
    }

    @Override
    protected Response handle(Request request) {
        getLogger().info("Handling request");
        Response response = new TypeQResponse(request.getPayload());
        return response;
    }
}
