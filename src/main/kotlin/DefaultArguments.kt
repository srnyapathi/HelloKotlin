/**
 * There are times wherein we need a default value
 * and caller does not want to fill in .
 * Consider someone is paying for food delivery order
 * there is bill amount and there commission 5% to delivery boy
 * If there is peak time going on , commission goes up to 10%
 * Kotlin does it nicely
 * */

fun pay( billAmount: Int,comm:Int = 1){
        println("Total Amount is ${billAmount} and commission ${comm} %")
}

fun main(){
        pay(100) // This works
        pay(100,2)
        //The above line also works for which
        // you need method overloading in java
        // here you get it for free
}