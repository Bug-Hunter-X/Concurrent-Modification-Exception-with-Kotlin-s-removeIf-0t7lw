fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.toMutableList().removeAll { it > 2 }
    println(list) // Output: [1, 2]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val mapCopy = map.toMutableMap()
    mapCopy.entries.removeAll { it.value > 2 }
    println(mapCopy) // Output: {a=1, b=2}

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val setCopy = set.toMutableSet()
    setCopy.removeAll { it > 2 }
    println(setCopy) // Output: [1, 2]
} 