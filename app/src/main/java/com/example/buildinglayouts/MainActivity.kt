package com.example.buildinglayouts


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomView: BottomNavigationView = findViewById(R.id.bottom_navigation)
        val navController = this.findNavController(R.id.nav_host_fragment)
        bottomView.setupWithNavController(navController)

    }
}