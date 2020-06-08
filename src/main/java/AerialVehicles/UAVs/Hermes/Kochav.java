package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.*;

public class Kochav extends Hermes implements AerialAttackVehicle, AerialIntelligenceVehicle, AerialBdaVehicle {
    private final static String JET_NAME = "Kochav";
    private int missileCount;
    private String missileType;
    private String sensorType;
    private String cameraType;

    public Kochav(int missileCount, String missileType, String cameraType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, readyToFly);
        this.missileCount = missileCount;
        this.missileType = missileType;
        this.cameraType = cameraType;
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

    @Override
    public String preformBda() {
        return super.getPilotName() + ": " + JET_NAME + " taking pictures of " + ((BdaMission) super.getMission()).getObjective() + " with: " + this.cameraType + " camera";
    }
}
