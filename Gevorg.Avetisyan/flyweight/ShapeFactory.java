package flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();
    public Shape getShape(String shapeName){

        Shape shape = shapes.get(shapeName);
        if (Objects.isNull(shape)){
            switch (shapeName){
                case "circle":
                    shape = new Circle();
                    break;
                case "point":
                    shape = new Point();
                    break;
                case "square":
                    shape = new Square();
                    break;
            }
            shapes.put(shapeName, shape);
        }
        return shape;
    }


}
