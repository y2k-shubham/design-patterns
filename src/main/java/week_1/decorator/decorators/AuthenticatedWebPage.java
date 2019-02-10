package week_1.decorator.decorators;

import week_1.decorator.models.IWebPage;

public class AuthenticatedWebPage extends WebPageDecorator {

    public AuthenticatedWebPage(IWebPage webPage) {
        super(webPage);
    }

    private void authenticateUser() {
        System.out.println("Authenticating user");
    }

    @Override
    public void display() {
        super.display();
        authenticateUser();
    }
}
