package week_2.chain_of_responsibility.request;

public class TypeBRequest extends Request {

    public TypeBRequest(String payload) {
        super(RequestType.TYPE_B, payload);
    }
}

