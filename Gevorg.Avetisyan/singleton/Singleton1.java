package singleton;

import java.util.Objects;

public class Singleton1 {
    public static Integer count = 0;
    private static Singleton1 instance;

    private Singleton1(){
        count++;
    }

    public static Singleton1 getInstance(){
        if (Objects.isNull(instance)){
            instance = new Singleton1();
        }
        return instance;
    }
}
