package com.kim.chapter8practice.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.kim.chapter8practice.R
import com.kim.chapter8practice.datas.Room

class Roomadapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {

        val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null){
            tempRow = inflater.inflate(R.layout.activity_room_list_item, null)
        }

        val row = tempRow!!

        val Roomdata = mList[position]
        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

        descriptionTxt.text = Roomdata.description
        addressAndFloorTxt.text = "${Roomdata.address}, ${Roomdata.getFormattedFloor()}"
        priceTxt.text = Roomdata.getFormattedprice()

        return row
    }



}