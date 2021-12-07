class Duolingo(val roundSize: Int = 5, val language: String = "french") {
    var words = mutableListOf<Word>(
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
