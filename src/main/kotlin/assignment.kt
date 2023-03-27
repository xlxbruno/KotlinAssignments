import java.lang.StringBuilder
import kotlin.math.min

fun main(){
println(sum())
    println(evensum())
    println(q5())
    println(palindrome())
}

/*Q1*/
fun sum():Int{
    var list = arrayOf(1,2,3,4,5,6,7,8,9)
    var sum : Int = 0
    for (x in list){
        sum += x
    }
    return sum
}

/*Q2*/
fun evensum(){
    var list2 = arrayOf(1,2,3,4,5,6,7,8,9)
    var filteredlist = list2.filter { x -> x % 2== 0 }
    var z = filteredlist.sum()
    println(z)
}


/*Q5*/
fun q5(){
    val numlist = arrayOf(1,1,2,3,4,5,5,6,7,7,8,9)
    val result = numlist.toSet()
    println(result)


}

fun palindrome(){
    val word = "radar"
    val revword = "radar"
    if(word == revword){
        println("True")
    }
    else{
        println("False")
    }
}