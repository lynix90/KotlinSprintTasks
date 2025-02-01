package lesson_2

fun main () {
    val mainEmployee: Short = 50
    val mainSalary: Short = 30000
    val traineeEmployee: Short = 30
    val traineeSalary: Short = 20000
    val mainWorkersSalary = mainEmployee * mainSalary
    val totalSalary = traineeEmployee * traineeSalary + mainWorkersSalary
    val averageSalary = totalSalary / (mainEmployee + traineeEmployee)

    println("Расходы по зарплате постоянных сотрудников, р = " + mainWorkersSalary)
    println("Общие расходы по зарплате, р = " + totalSalary)
    println("Средняя зарплата, р = " + averageSalary)

}