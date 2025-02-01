package lesson_2

fun main () {
    val minedIron = 11
    val minedCrystals = 7
    val extraIron = (minedIron*0.2) - ((minedIron*0.2)%1)
    val extraCrystals = (minedCrystals*0.2) - ((minedCrystals*0.2)%1)

    println ("дополнительная железная руда = " + extraIron)
    print("дополнительная кристаллическая руда = " + extraCrystals)
}