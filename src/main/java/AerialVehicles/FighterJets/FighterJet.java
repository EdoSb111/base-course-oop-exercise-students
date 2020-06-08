package AerialVehicles.FighterJets;

import AerialVehicles.AerialVehicle;
import Missions.Mission;

public abstract class FighterJet extends AerialVehicle {
    private final static int MAX_HOURS_OF_FLIGHT_SINCE_LAST_REPAIR = 250;

    public FighterJet(String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, readyToFly, MAX_HOURS_OF_FLIGHT_SINCE_LAST_REPAIR);
    }
}
