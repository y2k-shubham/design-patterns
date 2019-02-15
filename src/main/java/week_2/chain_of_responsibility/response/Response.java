package week_2.chain_of_responsibility.response;

public abstract class Response {

    private final ResponseType responseType;
    private String payload;

    Response(ResponseType responseType, String payload) {
        this.responseType = responseType;
        this.payload = payload;
    }

    public ResponseType getResponseType() {
        return responseType;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        String repr = String.format("Response(type=%s, payload=%s)", getResponseType().toString(), getPayload());
        return repr;
    }
}
