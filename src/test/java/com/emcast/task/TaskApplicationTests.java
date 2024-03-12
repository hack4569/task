package com.emcast.task;

import com.emcast.task.engine.AutomaticEngine;
import com.emcast.task.enumeration.GearKey;
import com.emcast.task.gear.AutomaticGear;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaskApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void 자동_변속계_테스트() {
		Car car = new Car(new AutomaticEngine(), new AutomaticGear(), new AutomaticMoving());
		car.startEngine();
		car.changeGear(GearKey.R);
		car.move();
	}
}
