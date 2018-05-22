package com.japca.mongo

import org.junit.Test
import org.reactivestreams.Subscriber
import org.reactivestreams.Subscription
import org.slf4j.LoggerFactory
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.core.scheduler.Schedulers


internal class Event : Subscription {

    override fun request(n: Long) {
        println("Request")
    }

    override fun cancel() {
        println("Cancel")
    }
}

internal class MySubscriber : Subscriber<String> {

    private var count: Long = 0
    private var subscription: Subscription? = null


    override fun onSubscribe(s: Subscription) {
        this.subscription = s
        subscription!!.request(2)
        //	System.out.println("On subscribe");
    }

    override fun onNext(s: String) {
        count++
        if (count >= 2) {
            count = 0
            subscription!!.request(2)
        }
        //		System.out.println("On next");
    }

    override fun onError(t: Throwable) {
        //	System.out.println("On Error");
    }

    override fun onComplete() {
        //	System.out.println("On Complete");
    }
}


//@Slf4j
class MongoApplicationTests {

    var log = LoggerFactory.getLogger(javaClass)

    @Test
    @Throws(InterruptedException::class)
    fun FluxTest() {
        log.info("----------- Just info -------------------")
        Flux.just("Ahoj", "Ja", "jsem", "tvuj", "prvni", "reactivni", "stream")
                .flatMap({ value ->
                    Mono.just(value.toUpperCase())
                            .subscribeOn(Schedulers.parallel())
                },
                        1)

                .subscribe { value -> log.info("Consumed: $value") }

        Thread.sleep(2000)
    }

    @Test
    @Throws(InterruptedException::class)
    fun anotherTest() {
        Flux.just("Ahoj", "Ja", "jsem", "tvuj", "prvni", "reactivni", "stream")
                .log()
                .map { item -> item.toUpperCase() }
                .subscribeOn(Schedulers.newParallel("sub"))
                .publishOn(Schedulers.newParallel("pub"), 2)
                .collectList()
                .subscribe { value -> log.info("Consumed: $value") }

        Thread.sleep(2000)

    }
}
