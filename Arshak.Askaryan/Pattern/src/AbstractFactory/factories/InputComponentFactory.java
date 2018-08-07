package AbstractFactory.factories;

import AbstractFactory.impl.DataTableComponent;
import AbstractFactory.impl.EditableTableComponent;
import AbstractFactory.impl.SimpleTableComponent;
import AbstractFactory.interfaces.Component;
import AbstractFactory.interfaces.Factory;

public class InputComponentFactory implements Factory{

    public Component getComponent(String inputComponentType) {
        switch (inputComponentType) {
            case "NUMBER":
                return new DataTableComponent();
            case "TEXT":
                return new SimpleTableComponent();
            case "PASSWORD":
                return new EditableTableComponent();
            default:
                throw new IllegalArgumentException("Invalid input type");
        }
    }
}
