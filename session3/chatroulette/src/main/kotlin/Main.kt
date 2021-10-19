fun main(){
    val persons = arrayOf(Student("Arno"),Comedian("Alex") ,Teacher("Bert"), Chatbot("Chatter"))

    val person = persons.random()
    person.introduction()
    person.talk()

    /* when (random) {
        is Student -> random.gossip()
        is Comedian -> random.joke()
        is Teacher -> random.fact()
    }*/
}
