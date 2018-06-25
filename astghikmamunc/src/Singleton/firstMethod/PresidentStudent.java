package Singleton.firstMethod;

import Singleton.model.Student;

/**
 * Created by astghik.mamunc on 6/25/2018.
 */
public class PresidentStudent extends Student {

    private static PresidentStudent presidentStudent;

    private PresidentStudent() {
        super();
    }

    public static PresidentStudent getInstance(){
        if(presidentStudent == null) {
            presidentStudent = new PresidentStudent();
        }
        return presidentStudent;
    }


    public Integer giveSpecialScolarShip(){
        return presidentScolarShip();
    }

    public static Integer presidentScolarShip(){
        return 50000;
    }

}
