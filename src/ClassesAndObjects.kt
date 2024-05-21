fun main(){
    val car = Car(model = "Alto", color = "Blue", numberOfWheels = 4);
    car.printModel()

}

class Car(val model:String, val numberOfWheels:Int, val color:String){
    fun printModel(){
        println("Model : $model, Number : $numberOfWheels, Color : $color")
    }
}