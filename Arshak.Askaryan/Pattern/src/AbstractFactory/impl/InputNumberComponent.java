package AbstractFactory.impl;

import AbstractFactory.interfaces.Component;

public class InputNumberComponent implements Component{
    @Override
    public void render() {
        System.out.println("Input Number Component Rendered");
    }
}
