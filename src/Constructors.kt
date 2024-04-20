fun main(){
    val student = Student("Marcos",15)
    student.printDetails()
}

class Student(var name: String, var age: Int){
    fun printDetails(){
        println("Name: $name , Age: $age")
    }
}