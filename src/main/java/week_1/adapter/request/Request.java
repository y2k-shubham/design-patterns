package week_1.adapter.request;

public abstract class Request {

    private RequestType requestType;
    private String endpoint;
    private String payload;

    public RequestType getRequestType() {
        return requestType;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public String getPayload() {
        return payload;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Request withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    public Request withPayload(String payload) {
        setPayload(payload);
        return this;
    }
}
