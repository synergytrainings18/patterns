package Visitor;

/**
 * Created by Arshak Askaryan on 05.11.2017.
 */
public class Client {
    public static void main(String[] args) {
        ItemElement[] itemElements = new ItemElement[]{
                new Notebook("Macbook", 1200),
                new Notebook("Acer", 299),
                new Drink("Coca Cola", 1, 5),
                new Drink("Wine", 10, 2),
                new Fruit("Apple", 2, 5)
        };
        int totalPrice = calculatePrice(itemElements);
        System.out.println("\nTotal price = " + totalPrice);
    }

    private static int calculatePrice(ItemElement[] items) {
        Visitor visitor = new VisitorImpl();
        int sum = 0;
        for (ItemElement item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
