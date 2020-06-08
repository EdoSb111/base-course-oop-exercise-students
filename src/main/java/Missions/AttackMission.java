package Missions;

import Entities.Coordinates;

public class AttackMission extends Mission{
    private String target;

    public AttackMission(String target, Coordinates cords) {
        super(cords);
        this.target = target;
    }

    public String getTarget() {
        return target;
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
