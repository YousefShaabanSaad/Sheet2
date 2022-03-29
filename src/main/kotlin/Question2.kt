fun main(args: Array<String>) {

    println("Enter Id")
    val id:Int= readLine()!!.toInt()
    println("Enter firstName")
    val firstName:String= readLine()!!
    println("Enter lastName")
    val lastName:String= readLine()!!
    println("Enter salary")
    val salary:Float= readLine()!!.toFloat()

    val employee=Employee(id, firstName, lastName, salary)
    employee.getEmployee()

    val employee1=Employee(id, firstName, lastName, salary)
    employee1.getEmployee()

    val employee2=Employee(id, firstName, lastName, salary)
    employee2.getEmployee()

}

class Employee(var id:Int, var firstName:String, var lastName:String, var salary:Float){
    companion object {
       var numberOfEmployees: Int=0
    }
    init {
     numberOfEmployees++
    }

    fun getEmployee(){
        println("Id $id")
        println("firstName $firstName")
        println("lastName $lastName")
        println("salary $salary")
        println("number $numberOfEmployees")
    }
}