package com.emcast.task.engine;

import com.emcast.task.Car;

//수동 변속기 시동
public class ManualEngine implements Engine {
    @Override
    public boolean on(Car car) {
        car.setBrake(true);
        car.setClutch(true);
        return true;
    }

    @Override
    public boolean off(Car car) {
        car.setBrake(true);
        car.setClutch(true);
        return true;
    }
}
