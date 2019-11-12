package com.mccarty.cloudcam2.di.component

import com.mccarty.cloudcam2.CameraApp
import com.mccarty.cloudcam2.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(app: CameraApp)
}