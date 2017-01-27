/**
 * Created by korcky on 27/01/17.
 */
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AbstractFactoryTest {

    private App republicArmyApp = new App();
    private App separatistArmyApp = new App();

    @Before
    public void setUp() {
        republicArmyApp.createArmy(new RepublicArmyFactory());
        separatistArmyApp.createArmy(new SeparatistArmyFactory());
    }

    @Test
    public void general() {
        final General republicGeneral = republicArmyApp.getGeneral();
        assertTrue(republicGeneral instanceof RepublicGeneral);
        assertEquals(RepublicGeneral.DESCRIPTION, republicGeneral.getDescription());

        final General separatistGeneral = separatistArmyApp.getGeneral();
        assertTrue(separatistGeneral instanceof SeparatistGeneral);
        assertEquals(SeparatistGeneral.DESCRIPTION, separatistGeneral.getDescription());
    }

    @Test
    public void officer() {
        final Officer republicOfficer = republicArmyApp.getOfficer();
        assertTrue(republicOfficer instanceof RepublicOfficer);
        assertEquals(RepublicOfficer.DESCRIPTION, republicOfficer.getDescription());

        final Officer separatistOfficer = separatistArmyApp.getOfficer();
        assertTrue(separatistOfficer instanceof SeparatistOfficer);
        assertEquals(SeparatistOfficer.DESCRIPTION, separatistOfficer.getDescription());
    }

    @Test
    public void pilot() {
        final Pilot republicPilot = republicArmyApp.getPilot();
        assertTrue(republicPilot instanceof RepublicPilot);
        assertEquals(RepublicPilot.DESCRIPTION, republicPilot.getDescription());

        final Pilot separatistPilot = separatistArmyApp.getPilot();
        assertTrue(separatistPilot instanceof SeparatistPilot);
        assertEquals(SeparatistPilot.DESCRIPTION, separatistPilot.getDescription());
    }

    @Test
    public void soldier() {
        final Soldier republicSoldier = republicArmyApp.getSoldier();
        assertTrue(republicSoldier instanceof RepublicSoldier);
        assertEquals(RepublicSoldier.DESCRIPTION, republicSoldier.getDescription());

        final Soldier separatistSoldier = separatistArmyApp.getSoldier();
        assertTrue(separatistSoldier instanceof SeparatistSoldier);
        assertEquals(SeparatistSoldier.DESCRIPTION, separatistSoldier.getDescription());
    }
}
