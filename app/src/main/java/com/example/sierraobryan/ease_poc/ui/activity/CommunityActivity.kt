package com.example.sierraobryan.ease_poc.ui.activity

import android.os.Bundle
import com.example.sierraobryan.ease_poc.R
import com.example.sierraobryan.ease_poc.ui.fragment.CommunityFragment
import com.example.sierraobryan.ease_poc.ui.fragment.YouFragment

class CommunityActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, CommunityFragment.newInstance())
                .commitNow()
        }

    }
}