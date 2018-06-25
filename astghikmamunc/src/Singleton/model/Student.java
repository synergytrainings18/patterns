package Singleton.model;

/**
 * Created by astghik.mamunc on 6/25/2018.
 */
public class Student {

    private String firstName;

    private String lastName;

    private boolean eligibleForScholarShip;

    // ...


    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isEligibleForScholarShip() {
        return eligibleForScholarShip;
    }

    public void setEligibleForScholarShip(boolean eligibleForScholarShip) {
        this.eligibleForScholarShip = eligibleForScholarShip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
        return lastName != null ? lastName.equals(student.lastName) : student.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    public Integer giveScolarShip(){
        return 8000;
    }
}
