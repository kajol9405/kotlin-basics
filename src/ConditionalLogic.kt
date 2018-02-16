fun main(args : Array<String>){
    val a = 2
    val b = 3
    if(a == b) {
        println(" A is equal to b")
    }
    if(a!=b){
        println(" A is not equal to b")
    }
    val accountBalance = 100
    val price = 50

    if(accountBalance >= price){
        println(" You can buy this!")
    }else{
        println(" InSufficient funds!")
    }
    // conditions similar toother languages. You can also add more else if
    // also you can try with more conditions with == != > < >= <=
    val x =3
    // replacement of if else and similar to switch case in java
    when(x){
        1 -> println(" x == 1")
        2 -> println(" x == 2")
        else -> println(" x == not found here")
    }

    fun isFeeling(mood : String = "Happy"){

        if(mood == "Happy"){
            println(" You are feeling $mood")
        }else{
            println(" Whatever you do, make people happy! ")
        }
    }
    isFeeling()
    isFeeling("Blessed")
}