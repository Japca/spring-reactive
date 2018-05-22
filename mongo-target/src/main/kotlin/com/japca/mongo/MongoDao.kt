package com.japca.mongo

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Flux

/**
 * Created by Jakub Krhovják on 5/10/18.
 */
interface MongoDao : ReactiveCrudRepository<Record, String> {

    fun findByIdentifier(identifier: Long): Flux<Record>

}
