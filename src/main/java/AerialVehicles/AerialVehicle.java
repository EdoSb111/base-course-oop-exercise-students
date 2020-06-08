package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle {
    private String pilotName;
    private Mission mission;
    private int hoursOfFlightSinceLastRepair;
    private boolean readyToFly;
    private int maxHoursOfFlightSinceLastRepair;

    public AerialVehicle(String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean readyToFly, int maxHoursOfFlightSinceLastRepair) {
        this.pilotName = pilotName;
        this.mission = mission;
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
        this.readyToFly = readyToFly;
        this.maxHoursOfFlightSinceLastRepair = maxHoursOfFlightSinceLastRepair;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public Mission getMission() {
        return mission;
    }

    public int getHoursOfFlightSinceLastRepair() {
        return hoursOfFlightSinceLastRepair;
    }

    public void setHoursOfFlightSinceLastRepair(int hoursOfFlightSinceLastRepair) {
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
    }

    public void flyTo() {
        System.out.println("Flying to: " + this.mission.getCords().getLatitude() + ", " + this.mission.getCords().getLongitude());
    }

    public void land() {
        System.out.println("Landing!");
    }

    public void check() {
        if (this.hoursOfFlightSinceLastRepair > this.maxHoursOfFlightSinceLastRepair) {
            this.repair();
        }
    }

    public void repair() {
        this.readyToFly = true;
        this.hoursOfFlightSinceLastRepair = 0;
    }
}
