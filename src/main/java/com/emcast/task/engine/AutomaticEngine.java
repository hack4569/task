package com.emcast.task.engine;

import com.emcast.task.Car;

//자동 변속기 시동
public class AutomaticEngine implements Engine {
    @Override
    public boolean on(Car car) {
        car.setBrake(true);
        return true;
    }

    @Override
    public boolean off(Car car) {
        car.setBrake(false);
        return false;
    }
}
