package fr.spse.sdp_ssp_kotlin

import android.app.Application
import android.content.Context
import android.content.res.Configuration
import android.util.Log

open class DimensionAwareApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        DimensionConfig.create(baseContext)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        DimensionConfig.INSTANCE.onConfigChanged(applicationContext, newConfig)
    }


}