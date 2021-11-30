class Duolingo {
    val words = mutableListOf<Word>(
        Word ("bonjour", "hallo", "french"),
        Word ("a bientôt", "tot ziens", "french"),
        Word ("ami", "vriend", "french"),
        Word ("voiture", "auto", "french"),
        Word ("telefoon","téléphone","french")
    )

    fun play(){
        words.random()
        val currentWords = words
}}