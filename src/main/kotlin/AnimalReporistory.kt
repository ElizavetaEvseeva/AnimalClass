class animalRepository constructor( val appDataBase: AppDataBase) {

    fun getAll(): MutableList<animal> {
        return appDataBase.list
    }

    fun findById(id: Int): animal? {
        return appDataBase.list.find { it.id == id}
    }

    fun insert(animal: animal): Unit{
        appDataBase.list.add(animal)
    }

    fun delete(animal: animal){
        appDataBase.list.remove(animal)
    }

    fun update(animal: animal){
        val animalA = findById(animal.id)
        if (animalA != null){
            val index = appDataBase.list.indexOf(animalA)
            appDataBase.list[index] = animal
        }

    }
}
