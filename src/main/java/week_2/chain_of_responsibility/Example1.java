// design inspiration from JournalDev: https://www.journaldev.com/1617/chain-of-responsibility-design-pattern-in-java

package week_2.chain_of_responsibility;

import week_2.chain_of_responsibility.handler.Handler;
import week_2.chain_of_responsibility.handler.TypeAHandler;
import week_2.chain_of_responsibility.handler.TypeBHandler;
import week_2.chain_of_responsibility.handler.TypeCHandler;
import week_2.chain_of_responsibility.request.Request;
import week_2.chain_of_responsibility.request.TypeARequest;
import week_2.chain_of_responsibility.request.TypeBRequest;
import week_2.chain_of_responsibility.request.TypeCRequest;
import week_2.chain_of_responsibility.response.Response;

public class Example1 {

    public static void main(String[] args) {
        // create handlers
        Handler typeAHandler = new TypeAHandler();
        Handler typeBHandler = new TypeBHandler();
        Handler typeCHandler = new TypeCHandler();

        // chain handlers
        typeAHandler.setNextHandler(typeBHandler);
        typeBHandler.setNextHandler(typeCHandler);

        // send requests
        Request typeARequest = new TypeARequest("my-typeA-request");
        Response response1 = typeAHandler.handleRequest(typeARequest);
        System.out.println("Received response " + response1);

        Request typeBRequest = new TypeBRequest("my-typeB-request");
        Response response2 = typeAHandler.handleRequest(typeBRequest);
        System.out.println("Received response " + response2);
        Response response3 = typeBHandler.handleRequest(typeBRequest);
        System.out.println("Received response " + response3);

        Request typeCRequest = new TypeCRequest("my-typeC-request");
        Response response4 = typeAHandler.handleRequest(typeCRequest);
        System.out.println("Received response " + response4);
        Response response5 = typeBHandler.handleRequest(typeCRequest);
        System.out.println("Received response " + response5);
        Response response6 = typeCHandler.handleRequest(typeCRequest);
        System.out.println("Received response " + response6);
    }
}
