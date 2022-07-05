package com.beyzanuraydemir.ikearecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.beyzanuraydemir.ikearecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.urunlerRecyclerView.layoutManager = LinearLayoutManager(this)

        val urunListesi = ArrayList<Urunler>()
        val u1 = Urunler("INGOLF","sandalye, beyaz","ingolf_sandalye_beyaz","529₺")
        val u2 = Urunler("ADDE","sandalye, siyah","adde_sandalye_siyah","139₺")
        val u3 = Urunler("ADDE","sandalye, beyaz","adde_sandalye_beyaz","139₺")
        val u4 = Urunler("INGOLF","sandalye, beyaz-hallarp bej","ingolf_sandalye_bej","899₺")
        val u5 = Urunler("LERHAMN","sandalye, venge-vittaryd bej","lerhamn_sandalye","649₺")

        urunListesi.add(u1)
        urunListesi.add(u2)
        urunListesi.add(u3)
        urunListesi.add(u4)
        urunListesi.add(u5)

        val adapter = UrunAdapter(this,urunListesi)
        binding.urunlerRecyclerView.adapter = adapter
    }

}