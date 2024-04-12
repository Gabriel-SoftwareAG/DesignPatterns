package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BalloonFactory {
    private Map<String, Balloon> balloons = new HashMap<>();

    public Balloon getBalloon(String color) {
        if (!balloons.containsKey(color)) {
            balloons.put(color, new ConcreteBalloon(color));
        }
        return balloons.get(color);
    }
}