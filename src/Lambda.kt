fun main(args: Array<String>) {

    // lambda is function literal where we do not define function outside
    //here left of -> shows parameters passed to function and right side shows the body/ return part of the function
    //

    val printMessage = { message : String -> println(message)}

    printMessage("Hello World!")

    val sumA = { x: Int, y:Int -> x+y}
    println(sumA(3,5))

    val sumB : (Int,Int) -> Int = {x, y -> x+y}
    fun downloadData(url : String, completion :() -> Unit){
        // send download request
        // we got back data
        // there were no network errors
     completion()
    }

    downloadData("fakeUrl.com"){println("Executed after completion()")}


    fun downloadCarData(url : String, completion :(Car) -> Unit){
        // send download request
        // we got back data
        // there were no network errors
        val car = Car("Tesla","X", "Black")
        completion(car)
    }

    downloadCarData("fakeUrl.com"){car ->
        println(car.make)
        println(car.model)
    }

    downloadCarData("fakeUrl.com"){
        println(it.make)
        println(it.model)
    }

    fun downloadTruckData(url : String, completion: (Truck?, Boolean) -> Unit){
        // make the web request
        // we get the results back
        val webRequestSuccess = true;
        if(webRequestSuccess){
            val truck = Truck("Ford", "F-150",10000)
            completion(truck,true)
        }else{
            completion(null,false)
        }
    }
    downloadTruckData("fakeUrl.com"){ truck, success ->
        if(success){
        // do something with truck
            truck?.tow()
        }else{
            println("Something went wrong!")
        }

    }





}