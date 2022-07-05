package com.beyzanuraydemir.ikearecyclerview

import java.io.Serializable

data class Urunler(var urunAdi: String,
                   var urunAciklama: String,
                   var urunGorsel: String,
                   var urunFiyat: String)  : Serializable{
}