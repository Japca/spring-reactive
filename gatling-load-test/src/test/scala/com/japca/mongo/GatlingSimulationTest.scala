package com.japca.mongo

import java.util.concurrent.TimeUnit

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef._

import scala.concurrent.duration.{Duration, FiniteDuration}

class GatlingSimulationTest extends Simulation {

  val scn = scenario("AddAndFindPersons").repeat(100, "n") {
        exec(
          http("saveRecord")
            .post("http://localhost:8280/record")
            .header("Content-Type", "application/json")
            .body(StringBody("""{"identifier":"${n}","name":"Lojza_${n}","description":"description_${n}", "age":"${n}"} """))
            .check(status.is(200))
        ).pause(Duration.apply(100, TimeUnit.MILLISECONDS))
  }.repeat(100, "n") {
        exec(
          http("getRecord")
            .get("http://localhost:8280/record/${n}")
            .check(status.is(200))
        )   
  }
  
  setUp(scn.inject(atOnceUsers(50))).maxDuration(FiniteDuration.apply(1, "minutes"))
  
}