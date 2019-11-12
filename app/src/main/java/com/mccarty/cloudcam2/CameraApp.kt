package com.mccarty.cloudcam2

import android.app.Application
import com.mccarty.cloudcam2.di.component.AppComponent
import com.mccarty.cloudcam2.di.component.DaggerAppComponent
import com.mccarty.cloudcam2.di.module.AppModule

class CameraApp: Application() {
    val component: AppComponent by lazy {
        DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    override fun onCreate(){
        super.onCreate()
        component.inject(this)
    }
}