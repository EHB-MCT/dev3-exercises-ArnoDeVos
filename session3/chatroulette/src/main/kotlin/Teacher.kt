class Teacher (override val name:String): Person(name), ChatGuy {
    override fun talk(){
        fact()
    }
    fun fact(){
        println("Did you know Kotlin was named after an island")
    }
}