package com.example.lubuntupc.checkbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onCheckBoxClicked(view: View) {
      //  Log.d("Checks", "CheckboxClicked")
        view as CheckBox
        var isChecked:Boolean = view.isChecked

        when (view.id) {
            R.id.checkVeggies -> if (isChecked) {Log.d("veggies", "isChecked")}
            R.id.checkFruit -> if (isChecked) {Log.d("fruit", "isChecked")}
            R.id.checkMeal -> if (isChecked) {Log.d("meat", "isChecked")}
        }




    }
}
