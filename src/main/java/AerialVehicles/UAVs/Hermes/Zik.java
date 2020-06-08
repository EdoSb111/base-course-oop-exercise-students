package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Zik extends Hermes implements AerialIntelligenceVehicle, AerialBdaVehicle {
    private final static String JET_NAME = "Zik";
    private String sensorType;
    private String cameraType;

    public Zik(String cameraType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, readyToFly);
        this.cameraType = cameraType;
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
}
