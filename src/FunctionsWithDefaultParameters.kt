fun main(){
    studentDetails()
    studentDetails(name = "Aditya", age = 20)
}
fun studentDetails(name:String = "John Doe",age:Int = 25){
    println("$name is $age")
}