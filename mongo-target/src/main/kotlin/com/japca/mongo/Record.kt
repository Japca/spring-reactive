package com.japca.mongo

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 * Created by Jakub Krhovják on 5/10/18.
 */

@Document
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class Record(@Id var id: String, var identifier: Long, var name: String, var age: Int ) {

    constructor(): this("",  0, "", 0);
}


