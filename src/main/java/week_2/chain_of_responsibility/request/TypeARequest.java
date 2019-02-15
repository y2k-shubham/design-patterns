package week_2.chain_of_responsibility.request;

public class TypeARequest extends Request {

    public TypeARequest(String payload) {
        super(RequestType.TYPE_A, payload);
    }
}
