package AbstractFactory.client;

import AbstractFactory.api.BodyComponent;
import AbstractFactory.api.FooterComponent;
import AbstractFactory.api.HeaderComponent;
import AbstractFactory.api.TableFactory;

public class MaterialTableFactory implements TableFactory {
    @Override
    public HeaderComponent createHeaderComponent() {
        return new MaterialHeaderComponent();
    }

    @Override
    public BodyComponent createBodyComponent() {
        return new MaterialBodyComponent();
    }

    @Override
    public FooterComponent createFooterComponent() {
        return new MaterialFooterComponent();
    }
}
