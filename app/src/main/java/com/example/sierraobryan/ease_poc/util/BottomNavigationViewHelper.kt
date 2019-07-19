package com.example.sierraobryan.ease_poc.util

import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.lang.reflect.Field

open class BottomNavigationViewHelper {

    companion object {

        private final val MODE: String = "labelVisibilityMode"
        fun disableShiftMode(view: BottomNavigationView) {
            val menuView: BottomNavigationMenuView = view.getChildAt(0) as BottomNavigationMenuView
            val shiftingMode: Field = menuView.javaClass.getDeclaredField(MODE);
            shiftingMode.isAccessible = true
            shiftingMode.setBoolean(menuView, Boolean.javaClass.)
            shiftingMode.isAccessible = false
            for (i in 0..menuView.childCount) {
                var item : BottomNavigationItemView = menuView.getChildAt(i) as BottomNavigationItemView
                //noinspection RestrictedApi
                item.setShifting(false)
                // set once again checked value, so view will be updated
                //noinspection RestrictedApi
                item.setChecked(item.getItemData().isChecked());


            }
        }
    }

}