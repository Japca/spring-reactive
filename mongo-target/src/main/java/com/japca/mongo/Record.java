package com.japca.mongo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Jakub Krhovják on 5/10/18.
 */

@Document
@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Record {

	public Record(Long identifier, String name, String description, int age) {
		this.identifier = identifier;
		this.name = name;
		this.description = description;
		this.age = age;
	}

	@Id
	private String id;

	@Indexed
	private Long identifier;

	private String name;

	private String description;

	private int age;

}
