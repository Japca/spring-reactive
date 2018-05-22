package com.japca.mongo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

/**
 * Created by Jakub Krhovják on 5/10/18.
 */


@RestController
class MongoController {

    @Autowired
    lateinit var mongoDao: MongoDao

    @PostMapping("/record")
    fun saveRecord(@RequestBody record: Record): Mono<Record> {
        return mongoDao.save(record)
    }

    @GetMapping("/record/{id}")
    fun getRecord(@PathVariable("id") id: Long): Flux<Record> {
        return mongoDao.findByIdentifier(id)
    }

}
