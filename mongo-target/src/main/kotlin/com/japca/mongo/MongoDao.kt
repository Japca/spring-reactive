package com.japca.mongo

import org.springframework.data.repository.CrudRepository

/**
 * Created by Jakub Krhovják on 5/10/18.
 */
interface MongoDao : CrudRepository<Record, String> {

    fun findByIdentifier(identifier: Long): List<Record>
}
