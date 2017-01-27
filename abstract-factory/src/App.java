/**
 * Created by korcky on 27/01/17.
 */
public class App {

    private General general;
    private Officer officer;
    private Pilot pilot;
    private Soldier soldier;

    public General getGeneral() {
        return general;
    }

    public Officer getOfficer() {
        return officer;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public Soldier getSoldier() {
        return soldier;
    }

    public void createArmy(ArmyFactory factory) {
        general = factory.createGeneral();
        officer = factory.createOfficer();
        pilot = factory.createPilot();
        soldier = factory.createSoldier();
    }

    public void getDescription() {
        System.out.printf(" Generals in army: %s\n Officers in army: %s\n Pilots: in army %s\n Soldiers in army: %s\n",
                general.getDescription(), officer.getDescription(), pilot.getDescription(), soldier.getDescription());
    }

    public static void main(String[] args) {

        App app =  new App();

        app.createArmy(new SeparatistArmyFactory());
        System.out.print("Separatist army:\n");
        app.getDescription();

        app.createArmy(new RepublicArmyFactory());
        System.out.print("Republic army:\n");
        app.getDescription();

    }
}
