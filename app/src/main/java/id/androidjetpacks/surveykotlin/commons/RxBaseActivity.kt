package id.androidjetpacks.surveykotlin.commons

import android.support.v7.app.AppCompatActivity
import io.reactivex.disposables.CompositeDisposable

open class RxBaseActivity : AppCompatActivity() {

    //Pakai RX Java 2. Subscription
    protected var subscriptions = CompositeDisposable()

    override fun onResume() {
        super.onResume()
        subscriptions = CompositeDisposable()

    }

    override fun onPause() {
        super.onPause()
        subscriptions.clear()
    }
}