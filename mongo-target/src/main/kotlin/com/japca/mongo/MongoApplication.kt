package com.japca.mongo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
class MongoApplication {
}

fun main(args: Array<String>) {
    SpringApplication.run(MongoApplication::class.java, *args)
}