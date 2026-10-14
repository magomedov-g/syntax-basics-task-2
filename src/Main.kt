fun main() {
    print("Введите строку: ")
    val input = readLine() ?: ""


    val charCount = countCharacters(input)
    printCharacterCount(charCount)
}
fun countCharacters(input: String): Map<Char, Int> {
    val countMap = mutableMapOf<Char, Int>()

    for (char in input) {
        countMap[char] = countMap.getOrDefault(char, 0) + 1
    }
    return countMap
}
fun printCharacterCount(charCount: Map<Char, Int>) {
    if (charCount.isEmpty()) {
        println("Строка пуста")
        return
    }
    val sortedEntries = charCount.entries.sortedBy { it.key }

    println("Результат:")
    for ((char, count) in sortedEntries) {
        println("$char - $count")
    }
}