fun main(args: Array<String>) {

    var name  : String = "KAJOL"

    // ? after String indicates it can be nullable
    var nullableName : String? = "Do I exists?"
    nullableName = null

    // Null check
    var length = 0
    if(nullableName!=null){
        length = nullableName.length
    }else{
        length = -1
    }
    println(length)

    val l = if(nullableName!=null) nullableName.length else -1
    println(l)

    // Second method Safe call Operator ?
    // prints null if its null else return length
    println(nullableName?.length)

    // third method is elvis operator
    //similar to if else. the first condition returns a value if not null otherwise else is executed
    val len = nullableName?.length ?: -1
    val noName = nullableName ?: "No one knows me!"

    println(noName)

    // using !! if null found then it throws null pointer exception so use only when variable is not null

   // println(nullableName!!.length)


}