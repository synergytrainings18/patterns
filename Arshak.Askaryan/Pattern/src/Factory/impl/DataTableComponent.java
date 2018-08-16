package Factory.impl;


import Factory.interfaces.TableComponent;

/**
 * Created by arshak.askaryan on 11/13/2017.
 */
public class DataTableComponent implements TableComponent {

    @Override
    public void render() {
        System.out.println("Data Table Component Rendered");
    }

}
