class WordDeck {
    var words = mutableSetOf<Word>(
        FrenchWord("bonjour", "hallo"),
        FrenchWord("a bientôt", "tot ziens"),
        FrenchWord("ami", "vriend"),
        FrenchWord("voiture", "auto"),
        FrenchWord("téléphone", "telefoon"),
        FrenchWord("zéro", "nul"),
        FrenchWord("mardi", "dinsdag"),
        FrenchWord("french fries", "frieten"),
        EnglishWord("cat", "kat"),
        EnglishWord("hoodie", "trui"),)
}
fun filterByLanguage(language:String){
    words = words.filter { it.language ==language }.toMutableSet()
}