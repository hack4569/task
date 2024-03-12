package com.emcast.task.engine;

import com.emcast.task.Car;

public interface Engine {
    boolean on(Car car);
    boolean off(Car car);
}
