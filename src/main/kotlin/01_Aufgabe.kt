fun main() {
    rundWieEinKreis(5.0)
}

fun spongebob(laenge: Double){
    var flaecheninhalt: Double = laenge * laenge
    var umfang: Double = 4 * laenge

    println(flaecheninhalt)
    println(umfang)
}

fun einfachEinRechteck(a: Double, b: Double){
    var flaeche = a * b
    var umfang =  (2 * a) + (2 * b)

    println(flaeche)
    println(umfang)
}

fun rundWieEinKreis(radius: Double){
    val pi: Double = 3.14159
    var flaeche: Double = pi * (radius * radius)
    var umfang: Double = 2 * radius * pi

    println(flaeche)
    println(umfang)
}