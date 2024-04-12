package flyweight;

public class PartyDecorator {
    private BalloonFactory balloonFactory;

    public PartyDecorator(BalloonFactory balloonFactory) {
        this.balloonFactory = balloonFactory;
    }

    public void decoratePartyHall() {
        Balloon balloon1 = balloonFactory.getBalloon("red");
        balloon1.decorate("near the stage");

        Balloon balloon2 = balloonFactory.getBalloon("blue");
        balloon2.decorate("at the entrance");

        Balloon balloon3 = balloonFactory.getBalloon("red");
        balloon3.decorate("on the ceiling");

        // Additional balloon decorations...
    }
}