package week_1.decorator.decorators;

import week_1.decorator.models.IWebPage;

public abstract class WebPageDecorator implements IWebPage {

    protected IWebPage webPage;

    public WebPageDecorator(IWebPage webPage) {
        this.webPage = webPage;
    }

    @Override
    public void display() {
        this.webPage.display();
    }
}
