class Duolingo {
    val words = mutableListOf<Word>(
        Word ("bonjour", "hallo", "french"),
        Word ("a bientôt", "tot ziens", "french"),
        Word ("ami", "vriend", "french"),
        Word ("voiture", "auto", "french"),
        Word ("téléphone","telefoon","french"),
        Word ("zéro","nul","french"),
        Word ("mardi","dinsdag","french"),
        Word ("french fries","frieten","english"),
        Word ("cat","kat","english"),
        Word ("hoodie","trui","english")
    )

    fun play(){
        words.random()
        val currentWords = words.shuffled().take(5).toMutableSet()

        while (currentWords.isNotEmpty()){


        val selectedWord = currentWords.random()
        println("What is the translation of ${selectedWord.original}")
        val userAnswer = readLine()

        if (selectedWord.translated == userAnswer){
            currentWords.remove(selectedWord)
        }
        println(currentWords.count())
}
        println("good job")
}}
