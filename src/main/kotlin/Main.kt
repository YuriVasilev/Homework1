fun main(args: Array<String>) {

    val herb1 = Herbivores()
    herb1.name = "Rabbit"
    herb1.color = "Rose"
    herb1.character = "Furry"

    val herb2 = Herbivores()
    herb2.name = "Horse"
    herb2.color = "InApple"
    herb2.character = "Glorious"

    val carn1 = Carnivores()
    carn1.name = "Tiger"
    carn1.eyes = "Yellow"
    carn1.temper = "Graceful"

    val carn2 = Carnivores()
    carn2.name = "Hyena"
    carn2.eyes = "Red"
    carn2.temper = "Evil"

    println("Herbivores:")
    println(herb1.name)
    println(herb2.name)

    println()

    println("Carnivores:")
    println(carn1.name)
    println(carn2.name)

}