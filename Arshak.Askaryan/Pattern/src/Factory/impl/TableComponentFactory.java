package Factory.impl;

import Factory.interfaces.TableComponent;
import Factory.util.TableComponentType;

/**
 * Created by arshak.askaryan on 11/13/2017.
 */
public class TableComponentFactory {

    public static TableComponent getTableComponent(TableComponentType tableComponent) {
        switch (tableComponent) {
            case DATA_TABLE:
                return new DataTableComponent();
            case SIMPLE_TABLE:
                return new SimpleTableComponent();
            case EDITABLE_TABLE:
                return new EditableTableComponent();
            default:
                throw new IllegalArgumentException("Invalid table type");
        }
    }
}
