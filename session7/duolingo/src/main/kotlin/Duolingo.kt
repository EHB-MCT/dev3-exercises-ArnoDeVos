import java.lang.Exception

class Duolingo(val roundSize: Int = 5, val language: String = "french") {
    val wordDeck = WordDeck()

    init {
        words = WordDeck.words.filter { it.language == language }.toMutableList()
    }

    fun play() {
            //words.random()
            val currentWords = wordDeck.words.shuffled().take(roundSize).toMutableSet()
            //to mutableset => maakt ze aanpasbaar
            // sets zijn standaard niet aanpasbaar


            while (currentWords.isNotEmpty()) {
                // zolang ze niet leeg is blijven we vragen stellen aan de gebruiker


                val selectedWord = currentWords.random()
                println("Wat is de vertaling van " + selectedWord.original + "?")
                val userAnswer = readLine()

                if (selectedWord.translated == userAnswer) {
                    currentWords.remove(selectedWord)
                } else {
                    println("De juist vertaling was: " + selectedWord.translated)
                }

            }
            println("Je hebt nog " + currentWords.count() + " woorden te vertalen")
        }

    }