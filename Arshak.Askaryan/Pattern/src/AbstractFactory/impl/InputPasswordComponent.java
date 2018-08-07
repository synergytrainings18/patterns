package AbstractFactory.impl;

import AbstractFactory.interfaces.Component;

public class InputPasswordComponent implements Component {
    @Override
    public void render() {
        System.out.println("Input Password Component Rendered");
    }
}
