package Factory.impl;

import Factory.interfaces.TableComponent;

/**
 * Created by arshak.askaryan on 11/13/2017.
 */
public class EditableTableComponent implements TableComponent {

    @Override
    public void render() {
        System.out.println("Editable Table Component Rendered");
    }

}
