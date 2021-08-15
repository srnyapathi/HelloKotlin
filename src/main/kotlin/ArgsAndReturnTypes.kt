

/**
 * Every thing in kotlin is pass by value , in java its pass by reference
 * parameter followed by data type , similarly the return type is specified
 * after the parameters
 * Let us use some more features
 */

fun add(num1:Int,num2:Int ) : Int{
    return num1+num2
}

/**
 * Down the lane after 3  years you will come across a piece of code
 * what the heck is  10 and 20
 * division(10,29)
 * hmm which is numerator ? Which is denominator ?
 * For this kotlin provided us with a cool feature
 * called named arguments where in we can specify the
 * argument name and value in any order we like
 * division(denominator = 10,numerator = 100)
 */

fun division(numerator:Int,denominator:Int):Int{
    return numerator/denominator;
}

fun main(){
    println("Sum is :${add(100,200)}")
    println("div is :${division(denominator = 10,numerator = 100)}")
}
