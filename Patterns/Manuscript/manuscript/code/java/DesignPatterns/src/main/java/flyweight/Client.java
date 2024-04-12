package flyweight;

public class Client {
    public static void main(String[] args) {
        BalloonFactory balloonFactory = new BalloonFactory();
        PartyDecorator partyDecorator = new PartyDecorator(balloonFactory);
        partyDecorator.decoratePartyHall();
    }
}