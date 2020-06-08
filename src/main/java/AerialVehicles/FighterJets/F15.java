package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F15 extends FighterJet implements AerialAttackVehicle, AerialIntelligenceVehicle {
    private final static String JET_NAME = "F15";
    private int missileCount;
    private String missileType;
    private String sensorType;

    public F15(String sensorType, int missileCount, String missileType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, readyToFly);
        this.sensorType = sensorType;
        this.missileCount = missileCount;
        this.missileType = missileType;
    }

    @Override
    public String attack() {
        return super.getPilotName() + ": " + JET_NAME + " Attacking " + ((AttackMission) super.getMission()).getTarget() + " with: " + this.missileType + "X" + this.missileCount;
    }

    @Override
    public String collectIntelligence() {
        return super.getPilotName() + ": " + JET_NAME + " Collecting Data in " + ((IntelligenceMission) super.getMission()).getRegion() + " with sensor type: " + this.sensorType;
    }
}
