package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F16 extends FighterJet implements AerialAttackVehicle, AerialBdaVehicle {
    private final static String JET_NAME = "F16";
    private int missileCount;
    private String missileType;
    private String cameraType;

    public F16(String cameraType, int missileCount, String missileType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, readyToFly);
        this.missileCount = missileCount;
        this.missileType = missileType;
        this.cameraType = cameraType;
    }

    @Override
    public String attack() {
        return super.getPilotName() + ": " + JET_NAME + " Attacking " + ((AttackMission) super.getMission()).getTarget() + " with: " + this.missileType + "X" + this.missileCount;
    }

    @Override
    public String preformBda() {
        return super.getPilotName() + ": " + JET_NAME + " taking pictures of " + ((BdaMission) super.getMission()).getObjective() + " with: " + this.cameraType + " camera";
    }
}
