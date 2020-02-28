package de.alpharogroup.kotlin.learning


fun main(args: Array<String>) {

    val originalMap = mapOf(1 to 0, 2 to 1, 3 to 3)
    val filteredMap = originalMap.filterValues { it > 0 }
    println(filteredMap) // {2=1, 3=3}
    println(originalMap) // {1=0, 2=1, 3=3}

}
