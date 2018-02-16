fun main(args: Array<String>) {
    val rebels = arrayListOf("Leiah","Luke","Han Solo","Mon Mothma")
    val rebelVehicleHashMap = hashMapOf("Solo" to "Falcon", "Luke" to "Landspeeder")

    for( rebel in rebels){
        println("Name: $rebel")
    }
     // name: key vehicle:value
    for((name, vehicle) in rebelVehicleHashMap){
        println("$name gets around in their $vehicle")
    }
    var x = 10
    while(x>0){
        println(x)
        x--
    }
}