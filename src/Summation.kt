class Summation (num1:Int, num2:Int){
    private var number1:Int = num1
    private var number2:Int = num2


    fun sum(): Int {
        return  number1 + number2
    }
}

fun main() {

    var result =Summation(5,7);
    println("Result of 5 + 7 = ${result.sum()}")

}