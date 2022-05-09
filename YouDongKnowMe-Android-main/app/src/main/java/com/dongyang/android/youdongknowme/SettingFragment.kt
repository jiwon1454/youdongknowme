//package com.dongyang.android.youdongknowme
//import android.content.Intent
//import android.content.SharedPreferences
//import android.net.Uri
//import android.os.Bundle
//import androidx.preference.Preference
//import androidx.preference.PreferenceFragmentCompat
//
//class SettingFragment() : PreferenceFragmentCompat(), SharedPreferences.OnSharedPreferenceChangeListener{
//
//    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
//        setPreferencesFromResource(R.xml.settings_preference, rootKey)
//    }
//
//    override fun onResume() {
//        super.onResume()
//        preferenceManager.sharedPreferences.registerOnSharedPreferenceChangeListener(this)
//    }
//
//
//    override fun onPreferenceTreeClick(preference: Preference?): Boolean {
//        when(preference?.key){
//            "help" -> { startActivity(Intent(Intent.ACTION_VIEW).setData(Uri.parse("")))}
//        }
//        return super.onPreferenceTreeClick(preference)
//    }
//
//    override fun onSharedPreferenceChanged(p0: SharedPreferences?, p1: String?) {
//    }
//
//}