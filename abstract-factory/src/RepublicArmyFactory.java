/**
 * Created by korcky on 27/01/17.
 */
public class RepublicArmyFactory implements ArmyFactory {

    @Override
    public General createGeneral() {
        return new RepublicGeneral();
    }

    @Override
    public Officer createOfficer() {
        return new RepublicOfficer();
    }

    @Override
    public Pilot createPilot() {
        return new RepublicPilot();
    }

    @Override
    public Soldier createSoldier() {
        return new RepublicSoldier();
    }
}
