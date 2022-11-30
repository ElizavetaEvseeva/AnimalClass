class predators( id: Int , name: String, weight: Int, diet: String, val physicalFeatures : String): herbivores (
    id = id,
    name = name,
    weight = weight,
    diet = diet) {

    override fun toString(): String {
        return "predators(id=$id, name='$name', weight='$weight', diet='$diet', physicalFeatures='$physicalFeatures')"

    }
}
