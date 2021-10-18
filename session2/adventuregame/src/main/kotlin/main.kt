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
        challengeTwo()
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
    println("Security is coming!!!")
}


fun challengeTwo() {
    val random = (1..6).random()
    println(random)

    print("What are the chances the cops will arrest you from 1-6?")

    val answer = readLine()

    if((1..3).contains(random) && answer == "low") {
        challengeThree()
    } else if ((4..6).contains(random) && answer == "high") {
        challengeOne()
    }
        else{gameOver()
}}
fun challengeThree(){
        println("There is someone coming")
        println("what will you do")
        println("flee - fight - hide")

        val userInput = readLine()

        when (userInput){
            "flee"->{
                println("you are outside of the building again")
                challengeOne()
            }
            "fight"-> {
                println("the teacher kicked your ass")
                gameOver()}
            "hide"->{
                println("the threat is gone, To continue pick a number between 1-100")
                challengeFour()
            }
        }
    }
    val userGuess = (1..100).random()
    fun challengeFour(){
        val userInput = Integer.valueOf(readLine())

        if (userInput == userGuess){
            challengeFive()
        }else if(userInput < userGuess){
            println("Too low")
            challengeFour()
        }else if(userInput > userGuess){
            println("Too high")
            challengeFour()
        }
    }
    fun challengeFive(){
        println("Correct, now it's time to steal something")
        val userInput = readLine()

        //first
        if(userInput == "computers"){
            println("You got away, time to sell it")
        }else{
            println("They are to heavy, try something else. Something that moves on his own")
            val userInput2 = readLine()

            //second
            if(userInput2 == "teacher"){
                println("You got away, time to sell him")
            }else{
                println("who wants to pay money for a teacher")
                println("there must be something else valuable")
                val userInput3 = readLine()

                //Third
                if(userInput3 == "server"){
                    println("You got away, time to sell it")
                }else{
                    println("You didn't find anything valuable")
                    gameOver()
                }
            }
        }
    }

