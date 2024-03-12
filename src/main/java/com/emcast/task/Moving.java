package com.emcast.task;

import com.emcast.task.enumeration.MoveStatus;

public interface Moving {
    MoveStatus move(Car car);
}
