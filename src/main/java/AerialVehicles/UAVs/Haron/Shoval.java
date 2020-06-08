package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.*;

public class Shoval extends Haron implements AerialIntelligenceVehicle, AerialBdaVehicle, AerialAttackVehicle {
    private final static String JET_NAME = "Shoval";
    private int missileCount;
    private String missileType;
    private String sensorType;
    private String cameraType;

    public Shoval(String cameraType, int missileCount, String missileType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, readyToFly);
        this.cameraType = cameraType;
        this.missileCount = missileCount;
        this.missileType = missileType;
        this.sensorType = sensorType;
    }

    @Override
    public String collectIntelligence() {
        return super.getPilotName() + ": " + JET_NAME + " Collecting Data in " + ((IntelligenceMission) super.getMission()).getRegion() + " with sensor type: " + this.sensorType;
    }

    @Override
    public String preformBda() {
        return super.getPilotName() + ": " + JET_NAME + " taking pictures of " + ((BdaMission) super.getMission()).getObjective() + " with: " + this.cameraType + " camera";
    }

    @Override
    public String attack() {
        return super.getPilotName() + ": " + JET_NAME + " Attacking " + ((AttackMission) super.getMission()).getTarget() + " with: " + this.missileType + "X" + this.missileCount;
    }
}

