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
        challenge2()
    }else{
        gameOver()
    }
}

//fun succes(){
    //println("You were able to enter, congrats")
//}
fun gameOver1(){
    println("Wrong building, security is coming!!!")
}
fun gameOver(){
    println("Wrong choice, security is coming!!!")
}
fun challenge2(){
    println("You entered the building")
    println("What do you want to steal?")
    println("computer, teacher or servers")
    val correctAnswers1 = setOf<String>("computer","servers")
    val userAnswer1 = readLine()
    if(correctAnswers1.contains(userAnswer1)){
        money()
    }else{
        gameOver2()
    }
}
fun money(){
    println("well done, now it's time to find a buyer")
}
fun gameOver2(){
    println("Wrong choice, who the hell wants to pay randsom for him?!?")
}

/*demo
fun challengeTwo(){
    val userGuess = readLine()
    val diceResult = (1..6).random()
    // todo: check == problem for strings
    if (diceResult >=)
    if
}
 */