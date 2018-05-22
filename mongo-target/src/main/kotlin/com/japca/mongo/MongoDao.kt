package com.japca.mongo

import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import reactor.core.publisher.Flux

/**
 * Created by Jakub Krhovják on 5/10/18.
 */
interface MongoDao : ReactiveMongoRepository<Record, String> {

    fun findByIdentifier(identifier: Long): Flux<Record>

}
