import kotlin.random.Random

class AppDataBase {
    val list = mutableListOf<animal>()

    init {
        for (i in 0..6){
            val animal = animal(id = i, name = "name$i", weight = i + Random.nextInt(50) )
            list.add(animal)
        }
    }
}
