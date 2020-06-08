package Missions;


import Entities.Coordinates;

import java.awt.*;

public abstract class Mission{
    private Coordinates cords;

    public Mission(Coordinates cords) {
        this.cords = cords;
    }

    public Coordinates getCords() {
        return cords;
    }

    abstract void begin();
    abstract void cancel();
    abstract void finish();
}
