fun main(args: Array<String>) {

    println("Enter Id")
    val id:Int= readLine()!!.toInt()
    println("Enter firstName")
    val firstName:String= readLine()!!
    println("Enter lastName")
    val lastName:String= readLine()!!
    println("Enter salary")
    val salary:Float= readLine()!!.toFloat()

    val employee=Employee1()
    employee.setId(id)
    employee.setFirstName(firstName)
    employee.setLastName(lastName)
    employee.setSalary(salary)
    println("Id ${employee.getId()}")
    println("firstName ${employee.getFirstName()}")
    println("lastName ${employee.getLastName()}")
    println("salary ${employee.getSalary()}")
    println("number ${employee.getNumberOfEmployees()}")
    println("Bouns ${employee.getBonus()}")

}

class Employee1{
    private var id:Int=0
    private var firstName:String=""
    private var lastName:String=""
    private var salary:Float=0f
    private companion object {
        var numberOfEmployees: Int=0
    }

    init {
        numberOfEmployees++
    }

    fun setId(id:Int){
        this.id=id
    }
    fun getId():Int{
        return id
    }

    fun setFirstName(firstName:String){
        this.firstName=firstName
    }
    fun getFirstName():String{
        return firstName
    }

    fun setLastName(astName:String){
        this.lastName=astName
    }
    fun getLastName():String{
        return lastName
    }

    fun setSalary(salary:Float){
        this.salary=salary
    }
    fun getSalary():Float{
        return salary
    }

    fun getNumberOfEmployees():Int{
        return numberOfEmployees
    }

    fun getBonus():Float{
     return salary + (0.05f*salary)
    }
}