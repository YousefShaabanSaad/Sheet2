fun main() {
    val audio=Audio()
    println("Enter Title")
    audio.setTitleA( readLine()!! )
    println("Enter time")
    audio.setTime( readLine()!!.toInt() )
    println("Enter price")
    audio.setPriceA( readLine()!!.toFloat() )

    println("Audio title: ${audio.getTitleA()}, price ${audio.getPriceA()}, time ${audio.getTime()} ")

    val book=Book()
    println("Enter Title")
    book.setTitleB( readLine()!! )
    println("Enter Count")
    book.setCount( readLine()!!.toInt() )
    println("Enter price")
    book.setPriceB( readLine()!!.toFloat() )

    println("Book title: ${book.getTitleB()}, price ${book.getPriceB()}, count ${book.getCount()} ")

}

open class Publication{
    private var title:String
    private var price:Float

    init {
        title=""
        price=0f
    }

    protected fun setTitle(title:String){
        this.title=title
    }
    protected fun getTitle():String{
        return title
    }

    protected fun setPrice(price:Float){
        this.price=price
    }
    protected fun getPrice():Float{
        return price
    }

}

class Book : Publication(){
    private var count:Int = 0

    init {
        setTitle("")
        setPrice(0f)
    }

    fun setTitleB(title:String){
        setTitle(title)
    }
    fun getTitleB():String{
        return getTitle()
    }

    fun setPriceB(price:Float){
        setPrice(price)
    }
    fun getPriceB():Float{
        return getPrice()
    }

    fun setCount(count:Int){
        this.count=count
    }
    fun getCount():Int{
        return count
    }
}

class Audio : Publication(){
    private var time:Int = 0

    init {
        setTitle("")
        setPrice(0f)
    }

    fun setTitleA(title:String){
        setTitle(title)
    }
    fun getTitleA():String{
        return getTitle()
    }

    fun setPriceA(price:Float){
        setPrice(price)
    }
    fun getPriceA():Float{
        return getPrice()
    }

    fun setTime(time:Int){
        this.time=time
    }
    fun getTime():Int{
        return time
    }
}