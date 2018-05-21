package com.japca.mongo;

import org.junit.Test;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;


class Event implements Subscription {

	@Override
	public void request(long n) {
		System.out.println("Request");
	}

	@Override
	public void cancel() {
		System.out.println("Cancel");
	}
}

class MySubscriber implements Subscriber<String> {

	private long count = 0;
	private Subscription subscription;


	@Override
	public void onSubscribe(Subscription s) {
		this.subscription = s;
		subscription.request(2);
	//	System.out.println("On subscribe");
	}

	@Override
	public void onNext(String s) {
		count++;
		if (count>=2) {
			count = 0;
			subscription.request(2);
		}
//		System.out.println("On next");
	}

	@Override
	public void onError(Throwable t) {
	//	System.out.println("On Error");
	}

	@Override
	public void onComplete() {
	//	System.out.println("On Complete");
	}
}


//@Slf4j
public class MongoApplicationTests {

	Logger log = LoggerFactory.getLogger(getClass()) ;

	@Test
	public void FluxTest() throws InterruptedException {
		Flux.just("Ahoj", "Ja", "jsem", "tvuj", "prvni", "reactivni", "stream")
				.flatMap(value ->
								Mono.just(value.toUpperCase())
										.subscribeOn(Schedulers.parallel()),
						1)

				.subscribe(value ->	log.info("Consumed: " + value));

		Thread.sleep(2000);
	}

	@Test
	public void anotherTest() throws InterruptedException {
		Flux.just("Ahoj", "Ja", "jsem", "tvuj", "prvni", "reactivni", "stream")
		        .log()
				.map(String::toUpperCase)
				.subscribeOn(Schedulers.newParallel("sub"))
				.publishOn(Schedulers.newParallel("pub"), 2)
				.collectList()
				.subscribe(value -> {
					log.info("Consumed: " + value);
				});

		Thread.sleep(2000);

	}
}
