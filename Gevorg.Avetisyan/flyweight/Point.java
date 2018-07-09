package flyweight;

public class Point implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("x =" + x + " y=" + y + " Draw Point");
    }
}
