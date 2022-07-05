package com.beyzanuraydemir.ikearecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.beyzanuraydemir.ikearecyclerview.databinding.CardTasarimBinding

class UrunAdapter(var context: Context, var urunListesi: List<Urunler>) : RecyclerView.Adapter<UrunAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(tasarim : CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim: CardTasarimBinding

        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(context)
        val tasarim = CardTasarimBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urun = urunListesi.get(position)
        val t = holder.tasarim

        t.urunImageView.setImageResource(context.resources.getIdentifier(urun.urunGorsel,"drawable",context.packageName))
        t.urunAd.text = urun.urunAdi
        t.urunAciklama.text = urun.urunAciklama
        t.urunFiyat.text = urun.urunFiyat
    }

    override fun getItemCount(): Int {
        return urunListesi.size
    }
}