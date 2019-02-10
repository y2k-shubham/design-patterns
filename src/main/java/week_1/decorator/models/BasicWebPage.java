package week_1.decorator.models;

public class BasicWebPage implements IWebPage {

    private String html;
    private String styleSheet;
    private String jsScripts;

    @Override
    public void display() {
        System.out.println("Basic web-page");
    }
}
