package Flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Objects;

public class FlyweightFactory {
    private static HashMap<String, Color> colors = new HashMap<>();

    public static Color getColor(String code){
        Color color = colors.get(code);
        if(Objects.nonNull(color)){
            return colors.get(code);
        }
        color = Color.decode(code);
        colors.put(code, color);
        return color;
    }
}
