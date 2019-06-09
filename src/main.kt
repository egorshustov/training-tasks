fun main() {
    //stonesAndJewels()
    //unitsSequence()
    //areAnagrams()
    //removeDuplicates()
    mergeLists()
}

fun stonesAndJewels() {
    val s = readLine()!!
    val j = readLine()!!
    var count = 0
    s.forEach {
        if (j.contains(it)) {
            ++count
        }
    }
    println(count)
}

fun unitsSequence() {
    var binaryArrayLength: Int? = null
    while (binaryArrayLength == null || binaryArrayLength >= 10000) {
        binaryArrayLength = readLine()?.toInt()
    }

    var maxUnitsCount = 0
    var currentUnitsCount = 0
    for (i in 0 until binaryArrayLength) {
        val binary = readLine()!!.toInt()
        if (binary == 1) {
            ++currentUnitsCount
        } else {
            currentUnitsCount = 0
        }
        if (currentUnitsCount > maxUnitsCount) {
            maxUnitsCount = currentUnitsCount
        }
    }
    println(maxUnitsCount)
}

fun areAnagrams() {
    var firstString = ""
    while ((firstString.isEmpty()) || (firstString.length > 100000)) {
        firstString = readLine()!!
    }

    var secondString = ""
    while ((secondString.isEmpty()) || (secondString.length > 10000)) {
        secondString = readLine()!!
    }

    if (secondString.length != firstString.length) {
        println(0)
    } else {
        for (firstStringSymbol in firstString) {
            var firstStringSymbolCount = 0
            var secondStringSymbolCount = 0
            for (symbol in firstString) {
                if (firstStringSymbol == symbol) {
                    ++firstStringSymbolCount
                }
            }
            for (symbol in secondString) {
                if (firstStringSymbol == symbol) {
                    ++secondStringSymbolCount
                }
            }
            if (firstStringSymbolCount != secondStringSymbolCount) {
                println(0)
                return
            }
        }
        println(1)
    }
}

fun removeDuplicates() {
    var arrayLength : Int? = null
    while (arrayLength == null || !((0 < arrayLength) && (arrayLength < 1000000))) {
        arrayLength = readLine()?.toInt()
    }

    val sortedSet = sortedSetOf<Int>()
    for (i in 0 until arrayLength) {
        val newNumber = readLine()!!.toInt()
        sortedSet.add(newNumber)
    }
    println(sortedSet)
}

fun mergeLists() {
    var arraysCount = 0
    while (arraysCount !in 1..1024) {
        arraysCount = readLine()!!.toInt()
    }

    val sortedSet = sortedSetOf<Int>()
    for (i in 0 until arraysCount) {
        val array = readLine()!!.trim().split(" ").map { it.toInt()}
        sortedSet.addAll(array)
    }
    println(sortedSet)
}


