package com.example.demo;

import com.example.demo.models.Rabbit;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RabbitApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void cannotPurchaseRabbitIfQuantityIsZero(){
		Rabbit rabbit = new Rabbit("Emma", "Dance Party", 100, 1);
		rabbit.purchaseRabbit();
		rabbit.purchaseRabbit();
	}

}
