package week_1.adapter;

import week_1.adapter.request.GetRequest;
import week_1.adapter.request.PostRequest;
import week_1.adapter.request.Request;
import week_1.adapter.request.RequestType;

public class WebClient {

    WebAdapter adapter;

    public WebClient(WebAdapter adapter) {
        this.adapter = adapter;
    }

    private Request createRequestObject(RequestType requestType) {
        Request request = null;
        switch (requestType) {
            case GET:
                request = new GetRequest();
                break;
            case POST:
                request = new PostRequest();
                break;
            default:
                throw new UnsupportedOperationException("Invalid request type: " + requestType);
        }
        return request;
    }

    public void doWork() {
        Request request = createRequestObject(RequestType.POST).
                withEndpoint("my.end.point").
                withPayload("my-payload");
        this.adapter.connect();
        int responseCode = this.adapter.request(request);
    }
}
