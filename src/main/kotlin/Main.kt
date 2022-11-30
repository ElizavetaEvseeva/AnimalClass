fun main(args: Array<String>) {

    val appDataBase = AppDataBase()
    val repository = animalRepository(appDataBase)
    // println(repository.getAll())
    val animal = repository.findById(5)
    //println(animal)
    if (animal != null) {
       repository.delete(animal)
    }
    //println(repository.getAll())


    val herbivores = herbivores(1, "Cow", 750, "grass")
    val herbivores1 = herbivores(2, "Пoat", 55, "grass")
    val predators = predators(3, "Tiger", 200, "Meat","fangs"  )
    val predators1 = predators(5, "Jaguar", 100, "Meat","fangs"  )

    val list = mutableListOf<animal>()
    list.add(herbivores)
    list.add(predators)
    list.add(predators1)
    list.add(herbivores1)

    println(list)


}