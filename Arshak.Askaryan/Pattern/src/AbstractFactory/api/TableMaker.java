package AbstractFactory.api;

public class TableMaker {
    private HeaderComponent headerComponent;
    private BodyComponent bodyComponent;
    private FooterComponent footerComponent;
    private TableFactory tableFactory;

    public TableMaker(TableFactory tableFactory) {
        this.headerComponent = tableFactory.createHeaderComponent();
        this.bodyComponent = tableFactory.createBodyComponent();
        this.footerComponent = tableFactory.createFooterComponent();
    }

    public void makeTable(){
        this.headerComponent.render();
        this.bodyComponent.loadData();
        this.bodyComponent.render();
        this.footerComponent.render();
    }
}
