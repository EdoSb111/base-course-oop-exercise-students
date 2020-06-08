package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Eitan extends Haron implements AerialIntelligenceVehicle, AerialAttackVehicle {
    private final static String JET_NAME = "Eitan";
    private int missileCount;
    private String missileType;
    private String sensorType;

    public Eitan(int missileCount, String missileType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, readyToFly);
        this.missileCount = missileCount;
        this.missileType = missileType;
        this.sensorType = sensorType;
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
