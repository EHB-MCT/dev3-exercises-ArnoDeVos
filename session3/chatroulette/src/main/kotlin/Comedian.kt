class Comedian (override val name:String): Person(name), ChatGuy {
    override fun talk (){
        joke()
    }
    fun joke(){
        println("ja sorry tis nog te vroeg")
    }
}