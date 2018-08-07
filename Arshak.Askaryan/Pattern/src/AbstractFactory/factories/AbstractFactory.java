package AbstractFactory.factories;

import AbstractFactory.interfaces.Factory;

public class AbstractFactory {



    public Factory create(String type){
        switch (type){
            case "table" :
                return new TableComponentFactory();
            case "input" :
                return new InputComponentFactory();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }
}
