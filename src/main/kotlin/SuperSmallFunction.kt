/**
 * Consider this method
 * class Calculator{
 *  calculateSub(int a, int b){
 *  return a+b;
 *  }
 * }
 * For doing a small operation on data we have to write a
 * 1. write a class ,
 * 2. A function
 * 3. Actual logic
 *  we also have to include some fancy symbols in between
 *  This is how we do it in kotlin world 
 */

fun calculateSum(a:Int,b:Int) = a+b

fun main(){
    println("The value of calculation is ${calculateSum(1,10)}")
}
/** Every thing is an expression in kotlin **/