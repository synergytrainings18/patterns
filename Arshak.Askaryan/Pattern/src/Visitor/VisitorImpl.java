package Visitor;

/**
 * Created by Arshak Askaryan on 05.11.2017.
 */
public class VisitorImpl implements Visitor {
    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getWeight() * fruit.getPricePerKg();
        System.out.println("Cost of " + fruit.getName() + " is " + cost);
        return cost;
    }

    @Override
    public int visit(Drink drink) {
        int cost = drink.getCount() * drink.getPrice();
        System.out.println("Cost of " + drink.getName() + " is " + cost);
        return drink.getPrice();
    }

    @Override
    public int visit(Notebook notebook) {
        int cost = 0;
        if (notebook.getPrice() > 400) {
            cost = (int) (notebook.getPrice() * 0.9);
        } else {
            cost = notebook.getPrice();
        }
        System.out.println("Cost of " + notebook.getName() + " is " + cost);
        return cost;
    }
}
