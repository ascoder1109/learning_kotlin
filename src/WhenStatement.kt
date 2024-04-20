fun main(){
    val i = 2;
    when(i){
        1 ->  println("i is 1")
        2 ->  println("i is 2")
        3 ->  println("i is 3")
        else ->  println("i is neither 1 nor 2 nor 3")
    }
    val j = when{
        i==1 -> 1
        i==2 -> 2
        else -> 0
    }
    println(j)

}