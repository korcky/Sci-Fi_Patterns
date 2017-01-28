/**
 * Created by korcky on 27/01/17.
 */
public class CaldariShipFactory implements ShipFactory {

    @Override
    public Battleship createBattleship() {
        return new CaldariBattleship();
    }

    @Override
    public Cruiser createCruiser() {
        return new CaldariCruiser();
    }

    @Override
    public Industrial createTransport() {
        return new CaldariIndustrial();
    }

    @Override
    public Frigate createFrigate() {
        return new CaldariFrigate();
    }
}
