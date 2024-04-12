package flyweight;

class ConcreteBalloon implements Balloon {
    private String color;

    public ConcreteBalloon(String color) {
        this.color = color;
    }

    @Override
    public void decorate(String position) {
        System.out.println("Balloon with color '" + color + "' is floating " + position + " in the party hall.");
    }
}