package lesson_2

fun main () {
 val mainEmployee = 50
 val mainSalary = 30000

 val traineeEmployee = 30
 val traineeSalary = 20000

    val mainWorkersSalary = mainEmployee*mainSalary
    val totalSalary = traineeEmployee*traineeSalary+mainWorkersSalary
    val averageSalary = totalSalary/(mainEmployee+traineeEmployee)

    println(mainWorkersSalary)
    println(totalSalary)
    println(averageSalary)
}