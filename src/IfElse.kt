fun main(){
    val i = 6
    if(i%2==0){
        println("Even number")
    }
    else{
        println("Odd number")
    }

    val text : String = if(i>0) "+ve" else "-ve"
    print(text)
}