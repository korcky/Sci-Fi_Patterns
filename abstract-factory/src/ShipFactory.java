/**
 * Created by korcky on 26/01/17.
 */
public interface ShipFactory {
   Battleship createBattleship();
   Cruiser createCruiser();
   Industrial createTransport();
   Frigate createFrigate();
}
