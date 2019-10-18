const val MAX_EXPERIENCE: Int = 5000

fun main(args: Array<String>) {
    val playerName = "Estragon"
    var experiencePoints = 5
    var hasSteed = false
    var gold = 50
    var pubName = "The Unicorn's Horn"
    var pubDrinks = setOf( "mead", "wine", "LaCroix" )

    experiencePoints += 5
    println(experiencePoints)
    println(playerName)
    println(hasSteed)
    println(pubDrinks)
    println(playerName.reversed())
}