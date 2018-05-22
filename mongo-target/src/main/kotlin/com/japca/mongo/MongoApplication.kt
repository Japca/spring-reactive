package com.japca.mongo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.mongodb.config.EnableMongoAuditing
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories


@EnableMongoAuditing
@SpringBootApplication
@EnableReactiveMongoRepositories
class MongoApplication {
}

fun main(args: Array<String>) {
    SpringApplication.run(MongoApplication::class.java, *args)
}