package com.example.fragmenttask3_k

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {

    var btnCarInfo: Button? = null
    var btnOwnerInfo:Button? = null
    var ivMake: ImageView? = null
    var tvModel: TextView? = null
    var tvName:TextView? = null
    var tvTel:TextView? = null
    var fragmentManager: FragmentManager? = null
    var buttonFrag: Fragment? = null
    var listFrag:Fragment? = null
    var carInfoFrag:Fragment? = null
    var ownerInfoFrag:Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCarInfo = findViewById(R.id.btnCarInfo)
        btnOwnerInfo = findViewById(R.id.btnOwnerInfo)
        ivMake = findViewById(R.id.ivMake)
        tvModel = findViewById(R.id.tvModel)
        tvName = findViewById(R.id.tvName)
        tvTel = findViewById(R.id.tvTel)

        fragmentManager = supportFragmentManager

        listFrag = fragmentManager!!.findFragmentById(R.id.listFrag)
        buttonFrag = fragmentManager!!.findFragmentById(R.id.buttonFrag)
        carInfoFrag = fragmentManager!!.findFragmentById(R.id.carInfoFrag)
        ownerInfoFrag = fragmentManager!!.findFragmentById(R.id.ownerInfoFrag)

        fragmentManager!!.beginTransaction()
            .show(buttonFrag!!)
            .show(listFrag!!)
            .show(carInfoFrag!!)
            .hide(ownerInfoFrag!!)
            .commit()

        btnOwnerInfo!!.setOnClickListener(View.OnClickListener {
            fragmentManager!!.beginTransaction()
                .hide(carInfoFrag!!)
                .show(ownerInfoFrag!!)
                .commit()
        })

        btnCarInfo!!.setOnClickListener(View.OnClickListener {
            fragmentManager!!.beginTransaction()
                .show(carInfoFrag!!)
                .hide(ownerInfoFrag!!)
                .commit()
        })
    }

    fun onItemClicked(index: Int) {
        tvName!!.setText(ApplicationClass.cars?.get(index)?.getOwnerName())
        tvModel!!.setText(ApplicationClass.cars?.get(index)?.getModel())
        tvTel!!.setText(ApplicationClass.cars?.get(index)?.getOwnerTel())
        if (ApplicationClass.cars?.get(index)?.getMake().equals("Volswagen")) {
            ivMake!!.setImageResource(R.drawable.volkswagen)
        } else if (ApplicationClass.cars?.get(index)?.getMake().equals("Volswagen")) {
            ivMake!!.setImageResource(R.drawable.mercedes)
        } else {
            ivMake!!.setImageResource(R.drawable.mercedes)
        }
    }

}