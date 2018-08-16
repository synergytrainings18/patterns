package AbstractFactory.client;

import AbstractFactory.api.FooterComponent;

public class FlatFooterComponent implements FooterComponent {
    @Override
    public void render() {
        System.out.println("Flat Footer Component rendered");
    }
}
