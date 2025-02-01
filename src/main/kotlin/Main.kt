package org.example

fun main() {
    val timeInSpace: Float = 6480F //или верни обратно инт и ок
    val hoursPartOfTime = (timeInSpace / 3600) //целые часы
    val minutesPartOfTime = (timeInSpace % 3600) / 60 //целые минуты
    val secondsTimeOfTime = (timeInSpace % 3600) % 60
    print(hoursPartOfTime)
    print(":")
    print(minutesPartOfTime)
    print(":")
    print(secondsTimeOfTime)
}