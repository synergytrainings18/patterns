/**
 * Created by ruzanna.hovsepyan on 9/3/2018.
 */
public class Driver implements Fleshka{
    private Computer computer;

    public Driver(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void transferData() {
        // translate fleshka data to computer data
        computer.showData();
        System.out.println("Data transfer successfully");
    }
}
