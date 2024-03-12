package com.emcast.task.gear;

import com.emcast.task.Car;
import com.emcast.task.enumeration.GearKey;
import com.emcast.task.gear.Gear;

public class ManualGear implements Gear {
    @Override
    public boolean change(GearKey gearKey, Car car) {
        if (gearKey == GearKey.R) {
            if (car.isBrake() && car.isClutch()) {
                return true;
            }
        }
        return false;
    }
}
