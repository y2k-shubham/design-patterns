package week_2.observer;

import week_2.observer.concrete.Blog;
import week_2.observer.concrete.Subscriber;
import week_2.observer.specs.Notification;
import week_2.observer.specs.NotificationType;

public class Example {

    public static void main(String[] args) {
        Blog blog = new Blog("Geronimo");

        //
        blog.notifyObservers(new Notification(
                NotificationType.PROMOTION,
                "OnePlus bullets wireless",
                "limited time offer: buy for Rs. 3300 only!"
        ));

        //
        Subscriber subA = new Subscriber("subA");
        Subscriber subB = new Subscriber("subB");
        blog.registerObserver(subA);
        blog.registerObserver(subB);
        blog.notifyObservers(new Notification(
                NotificationType.PROMOTION,
                "Google Chromecast price drop",
                "Get Rs 450 off on Gen3 Google Chromecast, Use code MYGOOGL. Hurry!"
        ));

        //
        blog.unregisterObserver(subB);
        blog.notifyObservers(new Notification(
                NotificationType.NEWS,
                "Samsung Galaxy S10e launch",
                "The smaller sibling of the S10 family hits shelves on March 18th. AT&T & Verizon offering 12 & 18 month zero-cost plans"
        ));
    }
}
