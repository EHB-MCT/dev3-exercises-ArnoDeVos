fun main(){
    challengeOne()
}

fun challengeOne(){
    println("Try to break into Erasmus")
    println("Chose one of the buildings")
    val correctAnswers = setOf<String>("a","b", "c")
    val userAnswer = readLine()
    if(correctAnswers.contains(userAnswer)){
        step1()
    }else{
        gameOver1()
    }
}

fun step1(){
    println("You are infront of the building")
    println("Which way do you want to go")
    println("roof, window, main door or cellars")
    val firstStep = setOf<String>("window", "cellar")
    val userAnswer = readLine()
    if(firstStep.contains(userAnswer)) {
        succes()
    }else{
        gameOver()
    }
}

fun succes(){
    println("You were able to enter, congrats")
}
fun gameOver1(){
    println("Wrong choice, security is coming!!!")
}
fun gameOver(){
    println("Wrong choice, security is coming!!!")
}