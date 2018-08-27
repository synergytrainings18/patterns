package Proxy;

import java.util.Objects;

public class MainEntityProxy implements Entity {

    private MainEntity mainEntity;

    @Override
    public void loadEntity() {
        if(Objects.isNull(mainEntity)){
            mainEntity = new MainEntity();
        }
        mainEntity.loadEntity();
    }
}
