package com.example.sierraobryan.ease_poc.ui.activity

import android.os.Bundle
import com.example.sierraobryan.ease_poc.R
import com.example.sierraobryan.ease_poc.ui.fragment.FamilyListFragment
import com.example.sierraobryan.ease_poc.ui.fragment.YouFragment

class FamilyActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FamilyListFragment.newInstance())
                .commitNow()
        }

    }
}