package AbstractFactory.client;

import AbstractFactory.api.HeaderComponent;

public class MaterialHeaderComponent implements HeaderComponent{
    @Override
    public void render() {
        System.out.println("Material Header Component rendered");
    }
}
