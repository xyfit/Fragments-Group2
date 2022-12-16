package com.example.fragments

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val orqaga_btn = findViewById<Button>(R.id.orqaga_btn)
        val keyingi_btn = findViewById<Button>(R.id.keyingi_btn)

        orqaga_btn.setOnClickListener {
            changeFragment(Fragment_1())
        }
        keyingi_btn.setOnClickListener {
            changeFragment(Fragment_2())
        }

//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//            fragmentTransaction.replace(R.id.container1, Fragment_1())
//            fragmentTransaction.replace(R.id.container2, Fragment_2())
//            fragmentTransaction.replace(R.id.container3, Fragment_3())
//        fragmentTransaction.commit()


    }
    private fun changeFragment(fragment: Fragment){
//        replace fragment
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container1, fragment)
        fragmentTransaction.commit()


////        //add fragment
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction
//            .add(R.id.container1, fragment, "TAG")
//            .addToBackStack("TAG")
//        fragmentTransaction.commit()

    }
}