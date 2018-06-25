package singleton;

import java.util.Objects;

public class Singleton2 {  // problem lazy load
    public static Integer count = 0;
    private static Singleton2 instance = new Singleton2();

    private Singleton2(){
        count++;
    }

    public static Singleton2 getInstance(){
        return instance;
    }
}
