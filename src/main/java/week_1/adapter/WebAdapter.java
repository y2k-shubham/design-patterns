package week_1.adapter;

import week_1.adapter.request.Request;

import java.util.HashMap;
import java.util.Map;

public class WebAdapter implements WebRequester {

    WebService service;

    public void connect() {
        this.service = new WebService();
    }

    @Override
    public int request(Request request) {
        Map<String, String> requestMap = toMap(request);
        Map<String, String> responseMap = this.service.request(requestMap);
        if (responseMap != null) {
            return 200;
        } else {
            return 500;
        }
    }

    Map<String, String> toMap(Request request) {
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("type", request.getRequestType().toString());
        requestMap.put("endpoint", request.getEndpoint());
        requestMap.put("payload", request.getPayload());
        return requestMap;
    }
}
