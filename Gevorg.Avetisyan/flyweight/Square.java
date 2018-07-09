package flyweight;

public class Square implements Shape {
    int a = 5;

    @Override
    public void draw(int x, int y) {
        System.out.println("x =" + x + " y=" + y + " Draw Square with side - " + a);
    }
}
