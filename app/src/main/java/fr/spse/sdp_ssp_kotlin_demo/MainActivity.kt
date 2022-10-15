package fr.spse.sdp_ssp_kotlin_demo

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import fr.spse.sdp_ssp_kotlin.DimensionConfig
import fr.spse.sdp_ssp_kotlin.sdp
import fr.spse.sdp_ssp_kotlin.ssp

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.editedInCodeTextView)
        textView.post {
            val params = textView.layoutParams
            params.width = 60.sdp
            textView.layoutParams = params

            textView.textSize = 16.ssp
        }

    }
}