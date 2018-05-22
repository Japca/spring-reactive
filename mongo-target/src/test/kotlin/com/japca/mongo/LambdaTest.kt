package com.japca.mongo

import org.junit.Test

/**
 * Created by Jakub Krhovják on 5/22/18.
 *
 */

data class Employee(val firstName: String, val lastName: String, val age: Int) {

   //Static field
    companion object {
        val EMPTY: String = ""
    }

    constructor(): this (EMPTY, EMPTY, 0)

}

class LambdaTest {

    @Test
    fun simpleTest() {
        val employee = Employee("Jakub", "vesely", 23)
        val employees = listOf(employee,
                Employee("Petr","Jant", 15),
                Employee("Martina", "Svetla", 45),
                Employee("Jantare", "Blahovic", 23))

//        println(employees.minBy { it.age })
//        employees.forEach { println(it) }
        val groupBy = employees.filter { it.age < 40 }
                .groupBy { it.age }

        println(groupBy.get(23))



    }
}
