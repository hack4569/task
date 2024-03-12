package com.emcast.task;

import com.emcast.task.engine.Engine;
import com.emcast.task.enumeration.GearKey;
import com.emcast.task.enumeration.MoveStatus;
import com.emcast.task.exception.CarException;
import com.emcast.task.gear.Gear;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private Engine engine;
    private Gear gear;
    private Moving moving;
    //브레이크
    private boolean brake;
    //클러치
    private boolean clutch;
    //엑셀
    private boolean axel;
    //시동 상태
    private boolean engineStatus;
    //기어 상태
    private GearKey gearStatus;
    //움직임 상태
    private MoveStatus moveStatus;
    public Car(Engine engine) {
        this.engine = engine;
    }

    //시동걸기
    public void startEngine() {
        if (engine.on(this)) {
            setEngineStatus(true);
        }
    }
    //시동끄기
    public void endEngine() {
        if (engine.off(this)) {
            setEngineStatus(false);
        }
    }

    //기어변속
    public void changeGear(GearKey gearKey) {
        if (!engineStatus) {
            throw new CarException("시동이 걸리지 않았습니다.");
        }
        if (gear.change(gearKey, this)) {
            setGearStatus(gearKey);
        }
    }

    // 이동
    public void move() {
        if (!engineStatus) {
            throw new CarException("시동이 걸리지 않았습니다.");
        }

        setMoveStatus(moving.move(this));
    }

    @Builder
    public Car(Engine engine, Gear gear, Moving moving) {
        this.engine = engine;
        this.gear = gear;
        this.moving = moving;
    }
}
