fun main(args: Array<String>) {
    println("Enter model of car")
    val model:String= readLine()!!

    println("Enter number of seats of car")
    val numberOfSeats:Int= readLine()!!.toInt()

    println("Enter average speed of car")
    val averageSpeed:Int= readLine()!!.toInt()

    println("Enter state of car (off or on)")
    val state:String= readLine()!!

    val car = Car(model, numberOfSeats, averageSpeed, state)

    if (car.state == "on")
        car.engineStarted()
    else if (car.state == "off")
        car.engineOff()

    if(car.averageSpeed == 0)
        car.stop()
    else
        car.accelerating()
}

class Car(var model: String, var numberOfSeats: Int, var averageSpeed: Int, var state: String) {

    fun engineStarted() {
        println("starting the engine")
    }

    fun accelerating() {
        println("the car speed now is $averageSpeed")
    }
    fun stop() {
        println("the car stopped")
    }
    fun engineOff() {
        println("the engine is turned off")
    }
}