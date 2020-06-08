package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialVehicle;
import Missions.Mission;

public abstract class Haron extends AerialVehicle {
    private final static int MAX_HOURS_OF_FLIGHT_SINCE_LAST_REPAIR = 150;

    public Haron(String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, readyToFly, MAX_HOURS_OF_FLIGHT_SINCE_LAST_REPAIR);
    }
}
