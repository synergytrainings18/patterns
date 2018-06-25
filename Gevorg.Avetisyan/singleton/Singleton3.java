package singleton;

import java.util.Objects;

public class Singleton3 {
    public static Integer count = 0;
    private static Singleton3 instance;

    private Singleton3(){
        count++;
    }

    public static synchronized Singleton3 getInstance(){ // kkatarvi avel ashxatanq , synchronized harkavore katarel menak araji dimoxneri hamar,
        if (Objects.isNull(instance)){
            instance = new Singleton3();
        }
        return instance;
    }
}
