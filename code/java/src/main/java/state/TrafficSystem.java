package state;

class TrafficSystem {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight(new GreenState());

        // Green
        light.perform();

        // Green to Yellow
        light.setState(new YellowState());
        light.perform();

        // Yellow to Red
        light.setState(new RedState());
        light.perform();
    }
}