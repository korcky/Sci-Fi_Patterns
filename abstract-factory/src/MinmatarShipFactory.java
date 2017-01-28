/**
 * Created by korcky on 27/01/17.
 */
public class MinmatarShipFactory implements ShipFactory {

    @Override
    public Battleship createBattleship() {
        return new MinmatarBattleship();
    }

    @Override
    public Cruiser createCruiser() {
        return new MinmatarCruiser();
    }

    @Override
    public Industrial createTransport() {
        return new MinmatarIndustrial();
    }

    @Override
    public Frigate createFrigate() {
        return new MinmatarFrigate();
    }
}
