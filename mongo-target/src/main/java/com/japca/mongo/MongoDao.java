package com.japca.mongo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Jakub Krhovják on 5/10/18.
 */
public interface MongoDao extends CrudRepository<Record, String> {

	List<Record> findByIdentifier(long identifier);
}
