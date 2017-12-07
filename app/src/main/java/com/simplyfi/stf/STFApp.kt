package com.simplyfi.stf

import android.app.Application
import android.content.BroadcastReceiver
import android.content.Context
import android.content.SharedPreferences

/**
 * Created by USER on 12/4/2017.
 */
class STFApp : Application() {

    public lateinit var sharedPreference: SharedPreferences
    lateinit var appContext: Context
    lateinit var databseName: String
    lateinit var boardcast: BroadcastReceiver
    lateinit var editorSharePreference: SharedPreferences.Editor
    override fun onCreate() {
        super.onCreate()
        val PREFS_FILENAME = "com.simplyfi.stf.prefs"
        val BACKGROUND_COLOR = "background_color"
        sharedPreference = this.getSharedPreferences(PREFS_FILENAME, 0)

    }

}