fun main() {
    val numbers = intArrayOf(1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3)
    val newNumbers = arrayListOf<Int>()

    val numbersMap = countNumbers(numbers)

    numbers.forEach { num -> increaseAndAdd(num, newNumbers, numbersMap) }

    println(newNumbers)
}

fun countNumbers(numbers: IntArray): MutableMap<Int, Int> {
    val numbersMap = mutableMapOf<Int, Int>()
    for (i in numbers.indices) {
        numbersMap[numbers[i]] = 0
    }
    return numbersMap
}

fun increaseAndAdd(num: Int, newNumbers: ArrayList<Int>, numbersMap: MutableMap<Int, Int>) {
    numbersMap[num] = numbersMap[num]!! + 1
    if (numbersMap[num]!! <= 2) {
        newNumbers.add(num)
    }
}