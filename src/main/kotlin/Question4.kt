fun main(args: Array<String>) {

    val time = Time()
    println("Enter hour")
    time.setHour( readLine()!!.toInt() )
    println("Enter minute")
    time.setMinute( readLine()!!.toInt() )
    println("Enter second")
    time.setSecond( readLine()!!.toInt() )

    if(time.getSecond()>=60){
        time.setMinute(time.getMinute()+( time.getSecond() / 60))
        time.setSecond(time.getSecond() % 60)
    }
    if(time.getMinute()>=60){
        time.setHour(time.getHour()+( time.getMinute() / 60))
        time.setMinute(time.getMinute() % 60)
    }
    println("Time is ${time.getHour()} : ${time.getMinute()} : ${time.getSecond()}")
}
class Time {
    private var hour:Int
    private var minute:Int
    private var second:Int

    init {
        hour=0
        minute=0
        second=0
    }

    fun setHour(hour:Int){
        this.hour=hour
    }
    fun getHour():Int{
        return hour
    }

    fun setMinute(minute:Int){
        this.minute=minute
    }
    fun getMinute():Int{
        return minute
    }

    fun setSecond(second:Int){
        this.second=second
    }
    fun getSecond():Int{
        return second
    }
}