package com.vaibhavmojidra.puredependencyinjectionusingconstructorkotlin

import android.util.Log

class ServiceProvider {

    init {
        Log.i("MyInfo","Service Provider Constructed")
    }
    fun getServiceProvider(){
        Log.i("MyInfo","Service Provider Connected")
    }
}
