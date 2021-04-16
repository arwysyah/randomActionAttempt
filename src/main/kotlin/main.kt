import sun.rmi.runtime.Log

class Person {
    fun setName (name:String){
      val name = name
        println(name.length)
        for (i in 0 until (name.length/2)) {
            println(name[i])
        }
        println( name)
        val rect = Rectangle()
        rect.length= 9
        rect.height = 12
        println(rect.multiplyRect())
        rect.checkCondition(rect.length.toString(),rect.height.toString())
    }
}
fun loopData(data:Number){
    val xH = 12
var i = 0
    while(i<xH) {

        if(i===data)
            println("You gonna be married")

        i++
    }
    val result : Int = xH-i
   val d =   mulptiple(result,xH/2)
    println("this is what you've got ${d}")

}
fun mulptiple (a:Int,b:Int): Int {
    return a + b
}
fun whenActions (number: Number):Unit{
   val str:String = when(number){
        1 -> "x is 1"
        2 -> "x is 2"
        3 -> "x is 3"
        else -> {
            "x is Outer Value"
        }

    }
 loopData(number)
    println(str)
}
fun main(Args: Array<String>) {
    var data = Person()
    data.setName("Fatwa Aulia")
    val newName = "Indonesia"
    whenActions((newName.length/3))
}

class Rectangle{
    var length :Int = 0
    var height:Int = 0

    fun multiplyRect (): Int {
        return  height * length
    }
     fun checkCondition(param:String, param2:String){
         if(param === param2){
            println (true)
         }else{
             println (false)
         }
     }

}
