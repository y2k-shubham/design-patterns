package week_2.chain_of_responsibility.request;

public class TypeCRequest extends Request {

    public TypeCRequest(String payload) {
        super(RequestType.TYPE_C, payload);
    }
}

