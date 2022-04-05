package singleton;

public class SingletonV3 {

    private static final SingletonV3 INSTANCE = new SingletonV3();

    private SingletonV3() {}

    public static SingletonV3 getInstance() {
        return INSTANCE;
    }
}
