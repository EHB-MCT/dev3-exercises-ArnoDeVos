open class Person(open val name:String) {

    fun introduction(){
        println("Hello, my name is $name")
    }
    open fun talk(){
    }
}