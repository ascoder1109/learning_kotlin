fun main(){
    val emp = employee("Sagnik", 222)
}

class employee(val empName:String,val empId:Int){
    val id: Int
    val name: String
    init {
        id = empId;
        name = empName;
        println("Employee id is $id");
        println("Employee name is $name");
    }
}