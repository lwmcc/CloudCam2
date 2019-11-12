package com.mccarty.cloudcam2.di.module

import com.mccarty.cloudcam2.CameraApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(val app: CameraApp) {
    @Provides
    @Singleton
    fun provideApp() = app
}