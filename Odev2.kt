package com.talhapoluc.bootcampkotlinlearning.Odev2

import java.nio.DoubleBuffer

fun main() {
    println("Soru 1 : ${soru1(21.5)}")
    soru2(4.0,3.3)
    println("Soru 3 : ${soru3(6)}")
    soru4("merhaba",'a')
    println("Soru 5 : ${soru5(5)}")
    println("Soru 6 : ${soru6(30)}")
    print("Soru 7 : ${soru7(60)}")

}

fun soru1(derece : Double) : Double{

    var fahrein = 0.0
    fahrein = (derece * 1.8 + 32)
    return fahrein
}

fun soru2(uzunKenar : Double,kisaKenar : Double ){

    var dikdortgenCevre = (uzunKenar * 2) + (kisaKenar * 2)
    println("Soru 2 : ${dikdortgenCevre}")
}

fun soru3(sayi : Int) : Int{

    var faktoriyel = 1

    for (i in sayi downTo 2){
        faktoriyel *= i
    }
    return faktoriyel
}

fun soru4(kelime : String , harf : Char){

    var harfSayisi = 0
    for (i in kelime){
        if (i == harf){
            harfSayisi += 1
        }
    }
    println("Soru 4 : ${harfSayisi}")
}

fun soru5(kenarSayisi : Int) : Int{

    var icAcilarToplami = 0
    icAcilarToplami = (kenarSayisi - 2) * 180

    return icAcilarToplami
}

fun soru6(gun : Int) : Int{

    var calismaSaati = 0
    var maas = 0
    var mesai = 0

    calismaSaati = gun * 8
    mesai = calismaSaati - 160

    if (calismaSaati > 160){
        maas += (160 * 10) + mesai * 20
    }
    else{
        maas += calismaSaati * 10
    }

    return maas
}

fun soru7(kota : Int) : Int{

    var ucret = 0

    if (kota <= 50){
        ucret = 100
    }
    else{
        ucret = ((kota - 50) * 4) + 100
    }

    return ucret
}