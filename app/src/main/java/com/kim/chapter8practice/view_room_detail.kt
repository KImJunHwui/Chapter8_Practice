package com.kim.chapter8practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kim.chapter8practice.datas.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class view_room_detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("room") as Room

        priceTxt.text = roomData.getFormattedprice()
        addressTxt.text = roomData.address
        descriptionTxt.text = roomData.description
        floorTxt.text = roomData.getFormattedFloor()


    }
}