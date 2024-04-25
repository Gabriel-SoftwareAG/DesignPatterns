package state;

class TrafficSystem {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight(new GreenState());

        light.change(); // Green to Yellow
        light.setState(new YellowState());

        light.change(); // Yellow to Red
        light.setState(new RedState());

        light.change(); // Red to Green
    }
}