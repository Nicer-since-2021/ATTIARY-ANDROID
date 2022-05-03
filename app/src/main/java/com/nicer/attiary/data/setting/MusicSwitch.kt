package com.nicer.attiary.data.setting

import android.content.Context

class MusicSwitch(context: Context) {
    private val prefs = context.getSharedPreferences("setting", 0)

    fun getString(key: String, defValue: String) : String {
        return prefs.getString(key, defValue).toString()
    }

    fun setString(key:String, value:String){
        prefs.edit().putString(key, value).apply()
    }
}
