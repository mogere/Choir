package com.mogere.choir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.mogere.choir.fragments.ActivitiesFragment
import com.mogere.choir.fragments.HomeFragment
import com.mogere.choir.fragments.MembersFragment
import com.mogere.choir.room.ChoirDB
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val activitiesFragment = ActivitiesFragment()
        val membersFragment = MembersFragment()

        makeCurrentFragment(homeFragment)

        ChoirDB.get(application)

        bottom_nav.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.home -> makeCurrentFragment(homeFragment)
                R.id.members -> makeCurrentFragment(membersFragment)
                R.id.activities -> makeCurrentFragment(activitiesFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.fl_main, fragment)
            commit()
        }
}