package com.dwarfplanet.snotifications

import android.app.Application
import android.content.Intent
import android.util.Log
import com.onesignal.OneSignal

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        //9464cba9-bd3e-45ee-83c7-8036e053a92b

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId("9464cba9-bd3e-45ee-83c7-8036e053a92b")
        OneSignal.setNotificationOpenedHandler {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("data",it.notification.title)
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }
    }
}