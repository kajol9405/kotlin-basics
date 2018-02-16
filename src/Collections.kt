fun main(args: Array<String>) {

    //list can be of strings , numbers
    // immutable list where we cannot add or remove elements is listOf()
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.last())
    println(imperials)
    println(imperials.contains("Emperor"))

    val rebels = arrayListOf("Leiah","Luke","Han Solo","Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0, "Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))
    rebels.remove("Han Solo")
    println(rebels)

    // immutable collection of map
    val rebelVehiclesMap = mapOf("Solo" to "Falcon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Lando", "Not found!"))
    println(rebelVehiclesMap.values)

    // mutable collection of map
    val rebelVehicleHashMap = hashMapOf("Solo" to "Falcon", "Luke" to "Landspeeder")
    rebelVehicleHashMap["Luke"] = "Xwing"
    rebelVehicleHashMap.put("Leiah","Tantive IV")
    println(rebelVehicleHashMap)
    rebelVehicleHashMap.remove("Luke")
    println(rebelVehicleHashMap)

    // checks if isEmpty and not you can clear it.
    rebelVehicleHashMap.isEmpty()
    rebelVehicleHashMap.clear()
}