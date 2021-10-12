fun main(){
    challengeOne()
}

fun challengeOne(){
    println("")
    println("")
    val correctAnswers = setOf<String>("a","c", "c")
    val userAnswer = readLine()
    if(correctAnswers.contains(userAnswer)){
        succes()
    }else{
        gameOver()
    }
}

fun succes(){
    println("You were able to break in")
}

fun gameOver(){
    println("Wrong side, security is coming!!!")
}