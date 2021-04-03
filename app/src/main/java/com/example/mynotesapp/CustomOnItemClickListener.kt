package com.example.mynotesapp

import android.view.View

class CustomOnItemClickListener(private val position: Int, private val onItemClickCallBack: OnItemClickCallBack): View.OnClickListener {
    override fun onClick(v: View) {
        onItemClickCallBack.onItemClicked(v, position)
    }

    interface OnItemClickCallBack {
        fun onItemClicked(view: View, position: Int)
    }
}