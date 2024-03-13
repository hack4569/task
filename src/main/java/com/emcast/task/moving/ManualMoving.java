package com.emcast.task.moving;

import com.emcast.task.Car;
import com.emcast.task.enumeration.GearKey;
import com.emcast.task.enumeration.MoveStatus;
import com.emcast.task.exception.CarException;

public class ManualMoving implements Moving {
    @Override
    public MoveStatus move(Car car) {
        if (GearKey.N == car.getGearStatus()) {
            throw new CarException("기어를 바꿔주세요.");
        }
        car.setBrake(false);
        car.setClutch(false);
        car.setAxel(true);
        if (GearKey.R == car.getGearStatus()) {
            return MoveStatus.GOBACK;
        } else {
            return MoveStatus.FORWARD;
        }
    }
}
