package Visitor;

/**
 * Created by Arshak Askaryan on 05.11.2017.
 */
public class Drink implements ItemElement {
    private String name;
    private int price;
    private int count;

    public Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
