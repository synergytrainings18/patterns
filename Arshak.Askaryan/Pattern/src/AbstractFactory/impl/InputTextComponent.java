package AbstractFactory.impl;

import AbstractFactory.interfaces.Component;

public class InputTextComponent implements Component {
    @Override
    public void render() {
        System.out.println("Input Text Component Rendered");
    }
}
