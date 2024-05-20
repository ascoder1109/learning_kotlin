fun main(args:Array<String>){
    println(functionDefaultParameter(7,8))
    println(functionDefaultParameter())
}

fun functionDefaultParameter(a : Int = 5,b: Int = 7):Int{
    return a + b;
}