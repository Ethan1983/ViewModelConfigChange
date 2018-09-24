package com.sample.viewmodelconfigchange

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel : MainViewModel

    companion object {
        const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel= ViewModelProviders.of( this ).get( MainViewModel::class.java )

        Log.d( TAG, "MainActivity created $this with $viewModel" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d( TAG, "MainActivity destroyed $this" )
    }
}
