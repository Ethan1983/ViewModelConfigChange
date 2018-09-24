package com.sample.viewmodelconfigchange

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.util.Log

class MainViewModel( application: Application ) : AndroidViewModel( application ) {

    companion object {
        const val TAG = "MainViewModel"
    }

    init {
        Log.d( TAG, "MainViewModel created $this" )
    }

}