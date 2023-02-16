package com.example.pembahasabsumatif1zahro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Hal_Jurusan : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recycleradapter: RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_jurusan)

        recyclerView = findViewById(R.id.rvJurusan)
        var data = ArrayList<DataJurusan>()
        data.add(DataJurusan(R.drawable.rpl,"REKAYASA PERANGKAT LUNAK"))
        data.add(DataJurusan(R.drawable.tb,"TATA BUSANA"))
        data.add(DataJurusan(R.drawable.tkj,"TEKNIK KOMPUTER DAN JARINGAN"))
        data.add(DataJurusan(R.drawable.tkr,"TEKNIK KENDARAAN RINGAN"))
        data.add(DataJurusan(R.drawable.tsm,"TEKNIK SEPEDA MONTOR"))

        recycleradapter = Adapter_Jurusan(data)
        layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter=recycleradapter
        recyclerView.layoutManager=layoutManager

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return  true
    }
}