package com.japca.mongo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * Created by Jakub Krhovják on 5/10/18.
 */


@RestController
class MongoController {

    @Autowired
    lateinit var mongoDao: MongoDao

    @PostMapping("/record")
    fun saveRecord(@RequestBody record: Record) {
        mongoDao.save(record)
    }

    @GetMapping("/record/{id}")
    fun getRecord(@PathVariable("id") id: Long): List<Record> {
        return mongoDao.findByIdentifier(id)
    }

}
