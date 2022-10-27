package com.quanticheart.sendcustonaction

import android.app.Application
import android.util.Log

//
// Created by Jonn Alves on 17/10/22.
//
class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        LifeCycleObserver(getLifeCycle()) {
            Log.d("APPLICATION", it)
        }
    }
}
