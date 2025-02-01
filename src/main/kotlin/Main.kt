package org.example

fun main() {
    val timeInSpace: Short = 6480
    val hoursPartOfTime = (timeInSpace / 3600)
    val minutesPartOfTime = (timeInSpace % 3600) / 60
    val secondsTimeOfTime = (timeInSpace % 3600) % 60

    print(hoursPartOfTime)
    print(":")
    print(minutesPartOfTime)
    print(":")
    print(secondsTimeOfTime)
}