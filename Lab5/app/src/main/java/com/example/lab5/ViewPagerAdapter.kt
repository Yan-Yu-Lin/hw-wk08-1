package com.example.lab5

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

// ViewPagerAdapter extends FragmentStateAdapter
// Receives FragmentManager and Lifecycle objects as parameters
class ViewPagerAdapter(
    fm: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fm, lifecycle) {

    // Returns the number of fragments (3 in this case)
    override fun getItemCount(): Int = 3

    // Returns the corresponding Fragment based on the position
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            // First page (FirstFragment)
            0 -> FirstFragment()
            // Second page (SecondFragment)
            1 -> SecondFragment()
            // Third page (ThirdFragment)
            else -> ThirdFragment()
        }
    }
}
