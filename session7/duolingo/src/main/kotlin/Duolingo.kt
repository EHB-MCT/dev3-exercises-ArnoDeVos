class Duolingo(val roundSize: Int = 5, val language: String = "french") {
    var words = mutableListOf<Word>(
        FrenchWord ("bonjour", "hallo"),
        FrenchWord("a bientôt", "tot ziens"),
        FrenchWord ("ami", "vriend"),
        FrenchWord ("voiture", "auto"),
        FrenchWord ("téléphone","telefoon"),
        FrenchWord ("zéro","nul"),
        FrenchWord ("mardi","dinsdag"),
        FrenchWord ("french fries","frieten"),
        EnglishWord ("cat","kat"),
        EnglishWord ("hoodie","trui"),
    )

        init {
           words = words.filter {it.language == language}.toMutableList()
        }
    fun play(){
        //words.random()
        val currentWords = words.shuffled().take(roundSize).toMutableSet()
        //to mutableset => maakt ze aanpasbaar
        // sets zijn standaard niet aanpasbaar


        while (currentWords.isNotEmpty()){
            // zolang ze niet leeg is blijven we vragen stellen aan de gebruiker


            val selectedWord = currentWords.random()
            println("Wat is de vertaling van " + selectedWord.original + "?")
            val userAnswer = readLine()

            if (selectedWord.translated == userAnswer){
               currentWords.remove(selectedWord)
            }else{println("De juist vertaling was: " + selectedWord.translated)
            }

            }
        println("Je hebt nog " + currentWords.count() + " woorden te vertalen")
        }

    }
