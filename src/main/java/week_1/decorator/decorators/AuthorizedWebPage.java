package week_1.decorator.decorators;

import week_1.decorator.models.IWebPage;

public class AuthorizedWebPage extends WebPageDecorator {

    public AuthorizedWebPage(IWebPage webPage) {
        super(webPage);
    }

    private void authorizeUser() {
        System.out.println("Authorizing user");
    }

    @Override
    public void display() {
        super.display();
        authorizeUser();
    }
}
