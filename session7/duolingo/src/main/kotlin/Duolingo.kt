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
        val currentWords = words.take(5)
        words.shuffle()
        currentWords.forEach{

        }
        println(currentWords)
}}