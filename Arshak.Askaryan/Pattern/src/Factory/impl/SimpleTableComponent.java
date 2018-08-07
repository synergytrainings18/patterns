package Factory.impl;

import Factory.interfaces.TableComponent;

/**
 * Created by arshak.askaryan on 11/13/2017.
 */
public class SimpleTableComponent implements TableComponent {

    @Override
    public void render() {
        System.out.println("Table Component Rendered");
    }

}
