package observer;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscription;

/**
 * Observer
 */
public class FlowInJava {

    public static void main(String[] args) {
        Flow.Publisher<String> publisher = subscriber -> {
            subscriber.onNext("hello flow");
            subscriber.onComplete();
        };

        Flow.Subscriber<String> subscriber = new Flow.Subscriber<String>() {

            @Override
            public void onSubscribe(Subscription subscription) {

            }

            @Override
            public void onNext(String item) {
                System.out.println(item);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {
                System.out.println("completed");
            }
        };

        publisher.subscribe(subscriber);
    }
}
