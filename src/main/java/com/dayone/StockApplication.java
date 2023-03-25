package com.dayone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class StockApplication {

	public static void main(String[] args) {
//		SpringApplication.run(StockApplication.class, args);

		for (int i = 0; i < 10; i++) {
			System.out.println("hello -> "+i);
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){
				throw new RuntimeException(e);
			}

		}

	}

}
