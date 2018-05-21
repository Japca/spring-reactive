package com.japca.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class MongoApplication {

	@Autowired
	private MongoDao mongoDao;

	public static void main(String[] args) {

		SpringApplication.run(MongoApplication.class, args);
	}

	@PostConstruct
	public void save() {
		System.out.println();
		Flux.just("Ahoj", "Ja", "jsem", "tvuj", "prvni", "reactivni", "stream")
				.log()
//				.doOnSubscribe(() -> new Event())
				.subscribe(item -> System.out.println("ahosj"));
	}
}
