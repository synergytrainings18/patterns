package AbstractFactory.client;

import AbstractFactory.api.BodyComponent;

public class MaterialBodyComponent implements BodyComponent {
    @Override
    public void render() {
        System.out.println("Material Body Component rendered");
    }

    @Override
    public void loadData() {
        System.out.println("Material Body Component data loaded");
    }
}
