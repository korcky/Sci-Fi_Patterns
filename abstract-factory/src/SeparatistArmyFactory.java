/**
 * Created by korcky on 27/01/17.
 */
public class SeparatistArmyFactory implements ArmyFactory {

    @Override
    public General createGeneral() {
        return new SeparatistGeneral();
    }

    @Override
    public Officer createOfficer() {
        return new SeparatistOfficer();
    }

    @Override
    public Pilot createPilot() {
        return new SeparatistPilot();
    }

    @Override
    public Soldier createSoldier() {
        return new SeparatistSoldier();
    }
}
