class Student (override val name:String): Person(name), ChatGuy {
    override fun talk(){
        gossip()
    }
    fun gossip(){
        println("I decline to answer")
    }
}