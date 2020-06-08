package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialVehicle;
import Missions.Mission;

public abstract class Hermes extends AerialVehicle {
    private final static int MAX_HOURS_OF_FLIGHT_SINCE_LAST_REPAIR = 100;

    public Hermes(String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, readyToFly, MAX_HOURS_OF_FLIGHT_SINCE_LAST_REPAIR);
    }
}
