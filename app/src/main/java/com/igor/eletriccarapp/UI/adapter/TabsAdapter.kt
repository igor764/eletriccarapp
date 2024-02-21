package com.igor.eletriccarapp.UI.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.igor.eletriccarapp.UI.CarFragment
import com.igor.eletriccarapp.UI.FavoritesFragment

class TabsAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
            return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0-> CarFragment()
            1-> FavoritesFragment()
            else -> {CarFragment()
            }
        }
    }
}