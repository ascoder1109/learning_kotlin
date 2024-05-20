fun main(){
    println(sumVarag(3,4,4,5,3,4,5,32,3))
}

fun sumVarag(vararg numbers: Int):Int{
    var sum = 0;
    for (i in numbers){
        sum += i;
    }
    return sum;
}