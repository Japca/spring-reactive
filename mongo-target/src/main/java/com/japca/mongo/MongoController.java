package com.japca.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Jakub Krhovják on 5/10/18.
 */



@RestController
public class MongoController {

	@Autowired
	private MongoDao mongoDao;

	@PostMapping("/record")
	public void saveRecord(@RequestBody Record record) {
		mongoDao.save(record);
	}

	@GetMapping("/record/{id}")
	public List<Record> getRecord(@PathVariable("id") Long id) {
         return mongoDao.findByIdentifier(id);
	}

}
