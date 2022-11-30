open class animal(val id:Int, var name: String, var weight: Int) {

    fun nameUpper(): String {
        return name.uppercase()
    }

    override fun toString(): String {
        return "Animal(id=$id, name='$name', weight=$weight)"
    }
}