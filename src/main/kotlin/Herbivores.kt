open class herbivores (id: Int , name: String, weight: Int, val diet: String) : animal(
    id = id,
    name = name,
    weight = weight) {

    override fun toString(): String {
        return "herbivores id=$id, name='$name', weight='$weight', diet='$diet')"
    }
}
