package AbstractFactory.client;

import AbstractFactory.api.BodyComponent;

public class FlatBodyComponent implements BodyComponent {
    @Override
    public void render() {
        System.out.println("Flat Body Component rendered");
    }

    @Override
    public void loadData() {
        System.out.println("Flat Body Component data loaded");
    }
}
