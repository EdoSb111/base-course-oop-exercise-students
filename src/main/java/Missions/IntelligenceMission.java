package Missions;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class IntelligenceMission extends Mission{
    private String region;

    public IntelligenceMission(String region, Coordinates cords) {
        super(cords);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    @Override
    void begin() {

    }

    @Override
    void cancel() {

    }

    @Override
    void finish() {

    }
}
