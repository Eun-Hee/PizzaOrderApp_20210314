package com.tjoeun.pizzaorderapp_20210314.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tjoeun.pizzaorderapp_20210314.fragments.MyProfileFregment
import com.tjoeun.pizzaorderapp_20210314.fragments.PizzaStoresFregment

class MyViewpagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "피자주문"
            else -> "내정보설정"
        }

    }
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> PizzaStoresFregment()
            else -> MyProfileFregment()
        }
    }

}