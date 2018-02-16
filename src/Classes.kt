//class Car constructor(make: String, model:String){
//    val make = make
//    val model = model
//}
// another way
//class Car (val make: String, val model:String, var color : String){
//    fun accelerate(){
//        println("speed speed")
//    }
//    fun details(){
//        println("This is a color $color $make $model")
//    }
//}
//
//class truck(val make: String, val model: String, val towingCapacity: Int){
//
//    fun tow(){
//        println("tow")
//    }
//}

// start class name with capital
// by default classes are final meaning you cannot inherit from them unless you write open before them
open class Vehicle(val make:String, val model:String){

    // to override methods in parent class set them to open 
  open fun accelerate(){
      println("speed")
  }
  fun park(){
      println( "park")
  }
  fun brake(){
      println( "stop")
  }
}
class Car(make:String,model:String, var color: String) : Vehicle(make,model){
    override fun accelerate() {
        println("accelerate in car class")
    }
}

class Truck(make:String,model:String, var towingCapacity : Int) : Vehicle(make,model){
    fun tow(){
       println("tow in truck")
    }

}

fun main(args: Array<String>) {

    val tesla = Car("Tesla","ModelS", "red")
    tesla.accelerate()
    tesla.park()
    tesla.brake()
    val truck = Truck("Ford", "F-150", 10000 )
    truck.tow()
//    val car = Car("Toyota","Avalon", "red")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.details()
//    val truck = truck("Ford", "F-150", 10000 )
//    truck.tow()
}