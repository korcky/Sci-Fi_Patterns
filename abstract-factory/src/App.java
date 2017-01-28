/**
 * Created by korcky on 27/01/17.
 */
public class App {

    private Battleship battleship;
    private Cruiser cruiser;
    private Industrial industrial;
    private Frigate frigate;

    public Battleship getBattleship() {
        return battleship;
    }

    public Cruiser getCruiser() {
        return cruiser;
    }

    public Industrial getIndustrial() {
        return industrial;
    }

    public Frigate getFrigate() {
        return frigate;
    }

    public void createShips(ShipFactory factory) {
        battleship = factory.createBattleship();
        cruiser = factory.createCruiser();
        industrial = factory.createTransport();
        frigate = factory.createFrigate();
    }

    public void getDescription() {
        System.out.printf(" Battleships in fleet: %s\n Cruisers in fleet: %s\n Industrials in fleet: %s\n Frigates in fleet: %s\n",
                battleship.getDescription(), cruiser.getDescription(), industrial.getDescription(), frigate.getDescription());
    }

    public static void main(String[] args) {

        App app =  new App();

        app.createShips(new CaldariShipFactory());
        System.out.print("Caldari fleet:\n");
        app.getDescription();

        app.createShips(new MinmatarShipFactory());
        System.out.print("Minmatar fleet:\n");
        app.getDescription();

    }
}
