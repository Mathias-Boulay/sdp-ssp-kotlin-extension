package fr.spse.sdp_ssp_kotlin


import java.text.DecimalFormat
import kotlin.math.floor
import kotlin.math.roundToInt


/* SDP - universal device pixel */
val Int.sdp: Int get() = ((this/3.0 * DimensionConfig.INSTANCE.supportedSmallestScreenWidth).roundToInt()/100).dp

val Float.sdp: Int get() = ((this/3.0 * DimensionConfig.INSTANCE.supportedSmallestScreenWidth).roundToInt()/100).dp

val Double.sdp: Int get() = ((this/3.0 * DimensionConfig.INSTANCE.supportedSmallestScreenWidth).roundToInt()/100).dp


/* SSP - universal device font size */
val Int.ssp: Float get() = ((this/3.0 * DimensionConfig.INSTANCE.supportedSmallestScreenWidth).roundToInt()/100).toFloat()

val Float.ssp: Float get() = ((this/3.0 * DimensionConfig.INSTANCE.supportedSmallestScreenWidth).roundToInt()/100).toFloat()

val Double.ssp: Float get() = ((this/3.0 * DimensionConfig.INSTANCE.supportedSmallestScreenWidth).roundToInt()/100).toFloat()


/* This section is taken and adapted from:
https://medium.com/lalafo-engineering/android-dimension-with-kotlin-extension-function-2-dp-8-sp-f202d1ce1df8
 */

/* DP - Device pixel */
val Int.dp: Int get() = if (this == 0) 0 else floor(DimensionConfig.INSTANCE.density * this.toDouble()).toInt()

val Float.dp: Int get() = if (this == 0f) 0 else floor(DimensionConfig.INSTANCE.density * this.toDouble()).toInt()

val Double.dp: Int get() = if (this == 0.0) 0 else floor(DimensionConfig.INSTANCE.density * this).toInt()


/* SP - Font scaling */
val Int.sp: Float get() = if (this == 0) 0f else floor(DimensionConfig.INSTANCE.fontDensity * this.toDouble()).toFloat()

val Float.sp: Float get() = if (this == 0f) 0f else floor(DimensionConfig.INSTANCE.fontDensity * this.toDouble()).toFloat()

val Double.sp: Float get() = if (this == 0.0) 0f else floor(DimensionConfig.INSTANCE.fontDensity * this).toFloat()
