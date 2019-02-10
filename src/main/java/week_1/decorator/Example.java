package week_1.decorator;

import week_1.decorator.decorators.AuthenticatedWebPage;
import week_1.decorator.decorators.AuthorizedWebPage;
import week_1.decorator.models.BasicWebPage;
import week_1.decorator.models.IWebPage;

public class Example {

    public static void main(String[] args) {
        IWebPage webPage = new BasicWebPage();
        webPage = new AuthorizedWebPage(webPage);
        webPage = new AuthenticatedWebPage(webPage);
        webPage.display();
    }
}
