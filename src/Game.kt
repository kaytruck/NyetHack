fun main() {
    val name = "Madrigal"
    val isImmortal = false
    var healthPoint = 89
    var isBlessed = true

    // Karma
    val rand = Math.random()
//    println("rand : $rand")
    val karma = (Math.pow(rand, (110-healthPoint) / 100.0) * 20).toInt()
//    println("karma : $karma")

    // Aura
    val (auraVisible, auraColor) = auraColor(isBlessed, healthPoint, isImmortal)

    // player status
    val healthStatus = formatHealthStatus(healthPoint, isBlessed)
//    printPlayerStatus(auraColor, isBlessed, name, healthStatus)
    printPlayerStatus(
        isBlessed = true,
        auraColor = auraColor,
        healthStatus = healthStatus,
        name = "Madrigal"
    )

    castFireball(10)
    val inebriationLevel = castFireball(40)
    val inebriationStatus = getInebriationStatus(inebriationLevel)

    println("inebriation status = $inebriationStatus")
//    castFireball()
//    shouldReturnAsString()
}

private fun getInebriationStatus(inebriationLevel: Int): String {
    return when (inebriationLevel) {
        in 1..10 -> "tipsy"
        in 11..20 -> "sloshed"
        in 21..30 -> "soused"
        in 31..40 -> "stewed"
        in 41..50 -> "fdsf8da92"
        else -> "設定値不正"
    }
}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println(
        "(Aura: $auraColor) " +
                "(Blessed: ${if (isBlessed) "Yes" else "No"})"
    )
    println("$name $healthStatus")
}

private fun auraColor(
    isBlessed: Boolean,
    healthPoint: Int,
    isImmortal: Boolean
): Pair<Boolean, String> =
   Pair(
       isBlessed && healthPoint > 50 || isImmortal,
       if (isBlessed && healthPoint > 50 || isImmortal) "light green" else "none"
   )

//    {
//    val auraVisible = isBlessed && healthPoint > 50 || isImmortal
//    val auraColor = if (auraVisible) "green" else "none"
////    val auraColor = when (karma) {
//    return Pair(auraVisible, auraColor)
//}

private fun formatHealthStatus(healthPoint: Int, isBlessed: Boolean): String =
    when (healthPoint) {
        100 -> "is in excellent conditions !"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly."
        } else {
            "has some minor wounds."
        }
        else -> "is in awful conditions !"
    }

private var inebriation = 0

private fun castFireball(numFireballs: Int = 2):Int {
    println("a glass of fireball springs into existence.(x$numFireballs)")
    inebriation += numFireballs
    if (inebriation > 50) {
        inebriation = 50
    }
    return inebriation
}

//fun shouldReturnAsString(): String {
//    println("abc")
//    TODO("this method should return as string")
//    println("def")
//}