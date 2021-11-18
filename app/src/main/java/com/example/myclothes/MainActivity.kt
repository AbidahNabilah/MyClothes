package com.example.myclothes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_Pria)
        btnMoveActivity.setOnClickListener(this)

        val btnWanita: Button = findViewById(R.id.btn_Wanita)
        btnWanita.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_Pria ->{
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_Wanita ->{
                val moveIntent = Intent(this@MainActivity, Wanita::class.java)
                startActivity(moveIntent)
            }
        }
    }
}