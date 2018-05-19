package com.japca.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jakub Krhovják on 5/10/18.
 */



@RestController
public class MongoController {

	@Autowired
	private MongoDao mongoDao;

	@PostMapping("/item")
	public void saveItem(@RequestBody Record record) {
		mongoDao.save(record);
	}

	@GetMapping("/item/{id}")
	public Record getItem(@PathVariable("id") Long id) {
         return mongoDao.findByIdentifier(id);
	}

}
