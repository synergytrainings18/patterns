package AbstractFactory.client;

import AbstractFactory.api.HeaderComponent;

public class FlatHeaderComponent implements HeaderComponent {
    @Override
    public void render() {
        System.out.println("Flat Header Component rendered");
    }
}
