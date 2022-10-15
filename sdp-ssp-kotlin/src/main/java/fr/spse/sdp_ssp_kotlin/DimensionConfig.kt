package fr.spse.sdp_ssp_kotlin

import android.content.Context
import android.content.res.Configuration
import android.util.Log
import kotlin.math.max

/** Simple class holding data */
class DimensionConfig private constructor(context: Context){
    companion object {
        fun create(context: Context){
            if(!this::INSTANCE.isInitialized)
                INSTANCE = DimensionConfig(context)
        }

        private val supportedSizes = List(27) { 300 + it * 30 }

        /** @return The supported screen size */
        private fun getNearestSupportedSize(screenWidth: Int): Int {
            for (i in supportedSizes.indices){
                if(screenWidth <= supportedSizes[i]){
                    return supportedSizes[max(0, i -1)]
                }
            }
            return supportedSizes[0]
        }

        lateinit var INSTANCE: DimensionConfig
        private set
    }

    /* The current declared screen width */
    var smallestScreenWidthDp: Int = 0
    private set

    /* The current used screen width */
    var supportedSmallestScreenWidth: Int =0
    private set

    var density = 1f
    private set
    var fontDensity = 1f
    private set

    init {
        onConfigChanged(context, null)
    }

    /** Update the configuration, has to be called application wide */
    fun onConfigChanged(context: Context, newConfiguration: Configuration?) {
        val configuration = newConfiguration ?: context.resources.configuration

        smallestScreenWidthDp = configuration.smallestScreenWidthDp
        supportedSmallestScreenWidth = getNearestSupportedSize(smallestScreenWidthDp)

        density = context.resources.displayMetrics.density
        fontDensity = context.resources.displayMetrics.scaledDensity

        //Log.d("DimensionConfig", "smallest screen width: " + smallestScreenWidthDp)
    }
}