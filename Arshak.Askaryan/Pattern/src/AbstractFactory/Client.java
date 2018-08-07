package AbstractFactory;

import AbstractFactory.factories.AbstractFactory;
import AbstractFactory.impl.DataTableComponent;

/**
 * Created by arshak.askaryan on 11/13/2017.
 */
public class Client {
    public static void main(String[] args) {

        DataTableComponent component = (DataTableComponent) new AbstractFactory().create("table").getComponent("DATA_TABLE");
        component.render();
    }
}
