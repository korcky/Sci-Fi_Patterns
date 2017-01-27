/**
 * Created by korcky on 26/01/17.
 */
public interface ArmyFactory {
   General createGeneral();
   Officer createOfficer();
   Pilot createPilot();
   Soldier createSoldier();
}
