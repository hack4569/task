package com.emcast.task.moving;

import com.emcast.task.Car;
import com.emcast.task.enumeration.MoveStatus;

public interface Moving {
    MoveStatus move(Car car);
}
