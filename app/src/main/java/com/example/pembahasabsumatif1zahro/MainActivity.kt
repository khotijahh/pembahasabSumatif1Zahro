package com.example.pembahasabsumatif1zahro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun jurusan (view: View){
        val pindah = Intent(this,Hal_Jurusan::class.java)
        startActivity(pindah)
    }

    fun guru (view: View){
        val pindah = Intent(this,Hal_Guru::class.java)
        startActivity(pindah)
    }

    fun siswa (view: View){
        val pindah = Intent(this,Hal_Siswa::class.java)
        startActivity(pindah)
    }

    fun visimisi (view: View){
        val pindah = Intent(this,Hal_VisiMisi::class.java)
        startActivity(pindah)
    }



}