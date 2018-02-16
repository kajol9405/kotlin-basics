fun main(args:Array<String>) {
    val str = "Hello to Strings"
    println(str)

    val str_test = """ |Hi check             all
            |the  spaces   """.trimMargin() // left aligns the text and removes all space from margin

    println(str_test)

//    for(char in str){
//        println(char)
//    }

    var contentEquals = str.contentEquals(charSequence = "Hello to Strings")
    println(contentEquals)

    val contains = str.contains("Strings", true)
    println(contains)


    val uppercase = str.toUpperCase()
    val lowercase =str.toLowerCase()

    println(uppercase + "\n" + lowercase)

    val subsequence = str.subSequence(4,13);
    println(subsequence)

    val name : String = "Kajol"
    var isAwesome = true // val is mutable

  //  println("Is " +name +" Awesome? " +"The answer is " +isAwesome) // old way

    println("Is $name Awesome? The answer is $isAwesome") //kotlin way
}