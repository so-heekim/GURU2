package com.example.guru2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class AppMain : AppCompatActivity() {

    //타이머
    lateinit var flogging_start:Button
    lateinit var floggint_time:TextView
    lateinit var btn_share:ImageView

    private var isRunning = false
    private var sec = 0L
    private var milli = 0L

    //버튼 3개
    lateinit var btn_walk:Button
    lateinit var btn_trash:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_main)

        flogging_start = findViewById(R.id.flogging_start)
        floggint_time = findViewById(R.id.flogging_time)
        btn_share = findViewById(R.id.btn_share)

        flogging_start.setOnClickListener {
            flogging_start.setText("종료")
            floggint_timer()
        }

        btn_walk = findViewById(R.id.btn_walk)
        btn_trash = findViewById(R.id.btn_trash)

        btn_walk.setOnClickListener {
            startActivity(Intent(this@AppMain, Walk::class.java))
        }

        btn_trash.setOnClickListener {
            startActivity(Intent(this@AppMain, Trash::class.java))
        }
    }

    //타이머
    fun floggint_timer() {

        flogging_start.setOnClickListener {
            flogging_start.visibility = View.INVISIBLE
            btn_share.visibility = View.VISIBLE
        }
    }
}