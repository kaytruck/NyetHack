import java.lang.Exception

fun main() {
    var swordJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient) {
        swordJuggling = 2
    }
    try {
        proficiencyCheck(swordJuggling)
        swordJuggling = swordJuggling!!.plus(1)
    } catch (e: Exception) {
        println(e)
    }
    println("You juggle $swordJuggling swords!")
}

fun proficiencyCheck(swordsJuggling: Int?) {
//    swordsJuggling ?: throw IllegalStateException("Player cannot juggle swords")
//    swordsJuggling ?: throw UnskilledSwordJugglerException()
    checkNotNull(swordsJuggling, {"Player cannot juggle swords"})
}

class UnskilledSwordJugglerException() :
        java.lang.IllegalStateException("Player cannot juggle swords")