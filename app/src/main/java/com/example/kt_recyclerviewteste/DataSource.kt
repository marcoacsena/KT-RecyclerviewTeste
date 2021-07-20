package com.example.kt_recyclerviewteste

import android.content.Context

class DataSource (val context: Context) {
    fun getFlowerList(): Array<String> {
        return context.resources.getStringArray(R.array.flower_array)
    }
}