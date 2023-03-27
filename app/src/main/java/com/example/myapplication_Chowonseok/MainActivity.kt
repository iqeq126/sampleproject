package com.example.myapplication_Chowonseok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
// 빌드위해서는 가상 디바이스 필요
// View => tool window=> device manager => create device => version etc ...