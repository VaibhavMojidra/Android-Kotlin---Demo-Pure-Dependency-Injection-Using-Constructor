package com.vaibhavmojidra.puredependencyinjectionusingconstructorkotlin

import android.util.Log

class MemoryCard {
    init {
        Log.i("MyInfo","Memory Card Constructed")
    }

    fun getSpaceAvailability(){
        Log.i("MyInfo","Memory space is available")
    }
}
