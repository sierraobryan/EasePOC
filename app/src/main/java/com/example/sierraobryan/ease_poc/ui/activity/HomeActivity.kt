package com.example.sierraobryan.ease_poc.ui.activity

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.sierraobryan.ease_poc.R
import com.example.sierraobryan.ease_poc.ui.fragment.YouFragment

class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, YouFragment.newInstance())
                .commitNow()
        }

    }
}
