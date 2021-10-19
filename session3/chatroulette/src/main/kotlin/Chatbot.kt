class Chatbot(val name: String): ChatGuy{
    override fun introduction(){
        println("Hello! I'm $name")
    }
    override fun talk(){
        println("heyyaaaaaa")
    }
}