fun main(){
    val Arno = Person("Arno")
    val Alex = Person("Alex")

    val persons = arrayOf(Arno, Alex)

    persons.random().introduction()
}