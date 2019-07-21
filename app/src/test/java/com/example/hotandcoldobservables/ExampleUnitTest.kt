package com.example.hotandcoldobservables

import io.reactivex.Observable
import org.junit.Test


class ExampleUnitTest {


    /** Cold Observables are those which emits all the items whenever we subscribe to them.
    Meaning, if two observers are subscribed to the same observable at different time,
    they will receive all the emissions from that observable.
    Its like playing a recorded mp3 song from a device, no matter when we play (subscribe)
    it we can hear the entire song all the time.*/
    @Test
    fun initColdObservable() {
        var coldObservable: Observable<String> = Observable.just("value_1", "value_2", "value_3")
        coldObservable.subscribe { s -> println("Observer_1: $s") }
        coldObservable.subscribe { s -> println("Observer_2: $s") }
    }
}
