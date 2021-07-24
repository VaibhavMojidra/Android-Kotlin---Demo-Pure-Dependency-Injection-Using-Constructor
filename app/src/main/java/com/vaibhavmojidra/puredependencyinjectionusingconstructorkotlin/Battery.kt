package com.vaibhavmojidra.puredependencyinjectionusingconstructorkotlin

import android.util.Log

class Battery {
    init {
        Log.i("MyInfo","Battery Constructed")
    }

    fun getPower(){
        Log.i("MyInfo","Battery Power is available")
    }
}
