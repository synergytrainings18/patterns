package AbstractFactory.client;

import AbstractFactory.api.BodyComponent;
import AbstractFactory.api.FooterComponent;
import AbstractFactory.api.HeaderComponent;
import AbstractFactory.api.TableFactory;

public class MutantTableFactory implements TableFactory {
    @Override
    public HeaderComponent createHeaderComponent() {
        return new FlatHeaderComponent();
    }

    @Override
    public BodyComponent createBodyComponent() {
        return new FlatBodyComponent();
    }

    @Override
    public FooterComponent createFooterComponent() {
        return new MaterialFooterComponent();
    }
}
