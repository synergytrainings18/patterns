package AbstractFactory.factories;

import AbstractFactory.impl.DataTableComponent;
import AbstractFactory.impl.EditableTableComponent;
import AbstractFactory.impl.SimpleTableComponent;
import AbstractFactory.interfaces.Component;
import AbstractFactory.interfaces.Factory;

/**
 * Created by arshak.askaryan on 11/13/2017.
 */
public class TableComponentFactory implements Factory {

    public Component getComponent(String tableComponent) {
        switch (tableComponent) {
            case "DATA_TABLE":
                return new DataTableComponent();
            case "SIMPLE_TABLE":
                return new SimpleTableComponent();
            case "EDITABLE_TABLE":
                return new EditableTableComponent();
            default:
                throw new IllegalArgumentException("Invalid table type");
        }
    }
}
