/**
 * Created by korcky on 27/01/17.
 */
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AbstractFactoryTest {

    private App caldariFleetApp = new App();
    private App minmatarFleetApp = new App();

    @Before
    public void setUp() {
        caldariFleetApp.createShips(new CaldariShipFactory());
        minmatarFleetApp.createShips(new MinmatarShipFactory());
    }

    @Test
    public void battleship() {
        final Battleship caldariBattleship = caldariFleetApp.getBattleship();
        assertTrue(caldariBattleship instanceof CaldariBattleship);
        assertEquals(CaldariBattleship.DESCRIPTION, caldariBattleship.getDescription());

        final Battleship minmatarBattleship = minmatarFleetApp.getBattleship();
        assertTrue(minmatarBattleship instanceof MinmatarBattleship);
        assertEquals(MinmatarBattleship.DESCRIPTION, minmatarBattleship.getDescription());
    }

    @Test
    public void cruiser() {
        final Cruiser caldariCruiser = caldariFleetApp.getCruiser();
        assertTrue(caldariCruiser instanceof CaldariCruiser);
        assertEquals(CaldariCruiser.DESCRIPTION, caldariCruiser.getDescription());

        final Cruiser minmatarCruiser = minmatarFleetApp.getCruiser();
        assertTrue(minmatarCruiser instanceof MinmatarCruiser);
        assertEquals(MinmatarCruiser.DESCRIPTION, minmatarCruiser.getDescription());
    }

    @Test
    public void industrial() {
        final Industrial caldariIndustrial = caldariFleetApp.getIndustrial();
        assertTrue(caldariIndustrial instanceof CaldariIndustrial);
        assertEquals(CaldariIndustrial.DESCRIPTION, caldariIndustrial.getDescription());

        final Industrial minmatarIndustrial = minmatarFleetApp.getIndustrial();
        assertTrue(minmatarIndustrial instanceof MinmatarIndustrial);
        assertEquals(MinmatarIndustrial.DESCRIPTION, minmatarIndustrial.getDescription());
    }

    @Test
    public void frigate() {
        final Frigate caldariFrigate = caldariFleetApp.getFrigate();
        assertTrue(caldariFrigate instanceof CaldariFrigate);
        assertEquals(CaldariFrigate.DESCRIPTION, caldariFrigate.getDescription());

        final Frigate minmatarFrigate = minmatarFleetApp.getFrigate();
        assertTrue(minmatarFrigate instanceof MinmatarFrigate);
        assertEquals(MinmatarFrigate.DESCRIPTION, minmatarFrigate.getDescription());
    }
}
