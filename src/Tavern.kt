fun main() {
    var beverage = readLine()
    beverage?.let {
        beverage = it.capitalize()
    } ?: println("I can't do that without crashing - beverage was null!")
    val beverageServed = beverage ?: "Buttered Ale"
    println(beverageServed)
}
