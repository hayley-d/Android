package com.example.recordkeeperapp

import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.commit
import com.example.recordkeeperapp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    private lateinit var binding : ActivityMainBinding
    private lateinit var container : FrameLayout
    private lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        this.container = binding.frameContent
        this.bottomNav = binding.bottomNav

        bottomNav.setOnNavigationItemSelectedListener (this)
    }

    override fun onNavigationItemSelected(item : MenuItem) : Boolean{
        if(item.itemId.equals(R.id.nav_bike))
        {
            onCyclingClicked()
            return true
        }
        else if(item.itemId.equals(R.id.nav_running))
        {
            onRunningClicked()
            return true
        }
        return false
    }

    private fun onRunningClicked(){
        supportFragmentManager.commit {
            replace(R.id.frame_content, RunningFragment())
        }
    }

    private fun onCyclingClicked(){
        supportFragmentManager.commit {
            replace(R.id.frame_content, CyclingFragment())
        }
    }
}