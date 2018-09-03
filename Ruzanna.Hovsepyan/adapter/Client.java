/**
 * Created by ruzanna.hovsepyan on 9/3/2018.
 */
public class Client {
    public static void main(String[] args) {
        Computer computer= new WindowsSystemComputer();
        Driver driver=new Driver(computer);
        driver.transferData();
    }
}
