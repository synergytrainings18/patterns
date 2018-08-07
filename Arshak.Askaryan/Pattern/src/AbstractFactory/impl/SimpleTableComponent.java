package AbstractFactory.impl;

import AbstractFactory.interfaces.Component;


/**
 * Created by arshak.askaryan on 11/13/2017.
 */
public class SimpleTableComponent implements Component {

    @Override
    public void render() {
        System.out.println("Table Component Rendered");
    }

}
