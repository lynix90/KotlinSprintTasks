package lesson_2

fun main () {
    val trainDepartureHour = 9
    val trainDepartureMinute = 39
    val travelTime = 457

    val trainDepartureInMinutes = (trainDepartureHour*60) + trainDepartureMinute
    val trainArrivedInMinutes = trainDepartureInMinutes+travelTime
    val trainArrivedHour = trainArrivedInMinutes/60
    val trainArrivedMinute = trainArrivedInMinutes%60

    print(trainArrivedHour)
    print(":")
    print(trainArrivedMinute)
}