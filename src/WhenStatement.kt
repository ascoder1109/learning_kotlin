fun main(){
    val alarm = 5;
    when (alarm) {
        12 -> println("Alarm is set to 12")
        1 -> println("Alarm is set to 1")
        2 -> println("Alarm is set to 2")
        in 5..9 -> println("Alarm is between 5 and 9")
        10,11 -> println("Alarm is between 10 and 11")
        else -> println("Alarm is not set")
    }
     val time = when (alarm){
         12 -> 4
         1 -> 3
         2 -> 5
         5 -> 3
         else -> null
     }
    println(time)

}