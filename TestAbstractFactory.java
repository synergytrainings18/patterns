import abstractFactory.AbstractFactory;
import abstractFactory.Combo_boxFactory;

/**
 * Created by ruzanna.hovsepyan on 8/7/2018.
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory factory= new Combo_boxFactory();
        factory.createCssFiles().generateCssFile("comboBox");
    }
}
