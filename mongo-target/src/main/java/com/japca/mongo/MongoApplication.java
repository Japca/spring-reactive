package com.japca.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoApplication {

	@Autowired
	private MongoDao mongoDao;

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}

//	@PostConstruct
//	public void save() {
//		mongoDao.save(new Record(1L,"ahoj1", "desription", 23));
//	}
}
