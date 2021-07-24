package com.vaibhavmojidra.puredependencyinjectionusingconstructorkotlin

import android.util.Log

class SimCard(val serviceProvider:ServiceProvider) {
    init {
        Log.i("MyInfo","SIM Card Constructed")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}
