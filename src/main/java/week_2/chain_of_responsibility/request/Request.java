package week_2.chain_of_responsibility.request;

public abstract class Request {

    private final RequestType requestType;
    private String payload;

    public Request(RequestType requestType, String payload) {
        this.requestType = requestType;
        this.payload = payload;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        String repr = String.format("Request(type=%s, payload=%s)", getRequestType().toString(), getPayload());
        return repr;
    }
}
