package singleton;

public class SingletonV5 {

    private SingletonV5() {
    }

    private static class SingletonV5Holder {
        private static final SingletonV5 INSTANCE = new SingletonV5();
    }

    public static SingletonV5 getInstance() {
        return SingletonV5Holder.INSTANCE;
    }
}
