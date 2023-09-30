 fun <T>MutableList<T>.deleteList(element: T) {
    this.add(element)
}

fun deleteListItem(item1: String, item2: MutableList<String>) {
    if (item1 != null) {
        val itemsToKeep = mutableListOf<String>()
        for (item in item2) {
            if (item != item1) {
                itemsToKeep.add(item)
            }
        }
        if (itemsToKeep.size == item2.size) {
            println("Item '$item1' not found in the list.")
        } else {
            item2.clear()
            item2.addAll(itemsToKeep)
            println("Your final list: $item2")
        }
    }
}

fun main() {
    println("Hello, do you want to add items to your box?")
    var item = mutableListOf<String>()
    var yesOrNot: Boolean = true
    while (yesOrNot) {
        var towar: String
        val q = readLine()
        if (q == "yes") {
            print("Enter an item to add to the box: ")
            towar = readLine() ?: ""
            if (!towar.isNullOrBlank()) {
                item.deleteList(towar) // Додати товар до списку
                println("Your list: $item") // Вивести список після додавання товару
            }
        } else if (q == "no") {
            println("Enter an item to delete from the box: ")
            var qNot = readLine()
            if (qNot != null) {
                deleteListItem(qNot, item)
            } else {
                println("LOL, YOU ARE **!?#@!")
                yesOrNot = false
                println("Your final list: $item") // Вивести остаточний список перед виходом
            }
        } else {
            println("LOL, YOU ARE **!?#@!")
            yesOrNot = false
            println("Your final list: $item") // Вивести остаточний список перед виходом
        }
    }
}
