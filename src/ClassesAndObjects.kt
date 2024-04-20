fun main(){
    val animal = Animal()
    animal.sound()
    println(animal.color)
}

class Animal{
    fun sound(){
        println("Animal Sound")
    }
    val color = "Brown"
}