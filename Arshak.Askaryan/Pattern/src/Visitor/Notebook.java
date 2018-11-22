package Visitor;

/**
 * Created by Arshak Askaryan on 05.11.2017.
 */
public class Notebook implements ItemElement {
    private String name;
    private int price;

    public Notebook(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
