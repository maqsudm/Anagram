
import scala.io.StdIn

object AnagramChecker {

  def main(args: Array[String]){
    println("Please enter a word to get the anagram for from our dictionary!")
    var word = StdIn.readLine()
    if(word.isEmpty || word == null){
      println("Please pass a word for which anagrams have to be found!")
      word = StdIn.readLine()
    }
    val anagramService = new AnagramService("src/main/resources/words.txt")
    val anagrams = anagramService.getAnagramsForWord(word)
    if(anagrams.isEmpty){
      println("Sorry there are no anagrams for this in our dictionary!")
    }else{
      println("Anagrams for "+ word + " are: ")
      anagrams.foreach(anagram => println(anagram))
    }
  }

}
