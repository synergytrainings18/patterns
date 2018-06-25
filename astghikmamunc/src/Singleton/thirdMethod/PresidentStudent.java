package Singleton.thirdMethod;

import Singleton.model.Student;

/**
 * Created by astghik.mamunc on 6/25/2018.
 */
public class PresidentStudent extends Student {

    private PresidentStudent() {
        super();
    }

    private static class PresidentStudentHolder{
        private static final PresidentStudent presidentStudent = new PresidentStudent();
    }

    public static PresidentStudent getInstance(){
        return PresidentStudentHolder.presidentStudent;
    }


    public Integer giveSpecialScolarShip(){
        return presidentScolarShip();
    }

    public static Integer presidentScolarShip(){
        return 50000;
    }

}
