package AbstractFactory.client;

import AbstractFactory.api.FooterComponent;

public class MaterialFooterComponent implements FooterComponent {
    @Override
    public void render() {
        System.out.println("Material Footer Component rendered");
    }
}
