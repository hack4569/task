package com.emcast.task.gear;

import com.emcast.task.Car;
import com.emcast.task.enumeration.GearKey;

public interface Gear {
    boolean change(GearKey gearKey, Car car);
}
