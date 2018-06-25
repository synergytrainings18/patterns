package singleton;

import java.util.Objects;

public class Singleton4 {
    public static Integer count = 0;
    private static volatile Singleton4 instance;

    private Singleton4(){
        count++;
    }

    public static Singleton4 getInstance(){
        if (Objects.isNull(instance)){
            synchronized(Singleton4.class){
                if (Objects.isNull(instance)){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
