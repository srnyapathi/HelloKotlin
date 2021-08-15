/**
 * As you can see here data type of parameter comes after the variable name
 * exact opposite of java .
 * As a business user or someone who is reading the code it feels logical
 * String arguments vs arguments String I'd go with second one as it is close
 * to natural language
 *  How to run this ?
 *  kotlinc CommandLineArgments.kt
 *  kotlin CommandLineArgumentsKt tom dick harry
 *
 */
fun main(arguments: Array<String>){
    println("arguments are "+ arguments.contentToString())
}