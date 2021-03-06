package id.androidjetpacks.surveykotlin.commons

import com.jakewharton.rxrelay2.PublishRelay
import com.jakewharton.rxrelay2.Relay

class RxBus {

    private val mBus: Relay<Any> = PublishRelay.create()

    fun send(event: Any){
        mBus.accept(event)
    }

    fun toObservable() = mBus

    fun hasObservers() = mBus.hasObservers()

    companion object {
        private val bus: RxBus = RxBus()

        @Synchronized fun get()= bus
    }
}