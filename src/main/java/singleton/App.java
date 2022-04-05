package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SingletonV5 singleton = SingletonV5.getInstance();

        Constructor<SingletonV5> constructor = SingletonV5.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonV5 singletonByReflection = constructor.newInstance();

        System.out.println(singleton != singletonByReflection);
    }
}
