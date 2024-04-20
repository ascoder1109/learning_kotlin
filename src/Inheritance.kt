fun main(){
    var alto = Alto()
    println(alto.color)
    println(alto.numberOfDoors)
}

open class Vehicle{
    open var numberOfDoors = 4
    open var color = "White"
}

class Alto : Vehicle() {
//    override var numberOfDoors = 5
    override var color = "Black"
}