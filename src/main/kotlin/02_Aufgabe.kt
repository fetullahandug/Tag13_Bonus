fun main() {
    println("2km sind: " + convertFromKMToMeter(2.0) + "m")
    println("2000 Meter sind: " + convertFromMeterToKM(2000.0) + "km")
}

fun convertFromMeterToKM(meter: Double): Double {
    return meter / 1000
}

fun convertFromKMToMeter(kilometer: Double): Double {
    return kilometer * 1000
}