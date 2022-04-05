package singleton;

public class SingletonV4 {

    private static volatile SingletonV4 instance;

    private SingletonV4() {
    }

    public static SingletonV4 getInstance() {
        if (instance == null) {
            synchronized (SingletonV4.class) {
                if (instance == null) {
                    instance = new SingletonV4();
                }
            }
        }

        return instance;
    }
}
