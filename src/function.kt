fun main(args: Array<String>) {
    fun printmyName() {
        println(" KAJOL PATEL ")
    }

    printmyName()

    fun makeAnEntrance(line: String) {
        println(line)
    }

    makeAnEntrance(" I just love learning more!")

    fun calculateNumber(x: Int, y: Int) : Int{
        val sum = x + y
        return sum
    }

    val answer =calculateNumber(10,11)
    println(" Sum = $answer")

    // another way of calling function without storing it in variable
    println(" Sum = ${calculateNumber(10,11)}")

    fun isFeeling(mood : String = " Happy"){
        println(mood)
    }
    isFeeling()
    isFeeling(" Blessed")

}