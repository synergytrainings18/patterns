package AbstractFactory.api;

public interface TableFactory {
    HeaderComponent createHeaderComponent();
    BodyComponent createBodyComponent();
    FooterComponent createFooterComponent();
}
