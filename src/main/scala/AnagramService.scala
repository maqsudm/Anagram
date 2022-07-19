import scala.io.Source

/**
 * I load the dictuionary file and check for anagrams for the given word.
 *
 * @param resourceLocation
 */
class AnagramService(val resourceLocation: String) {

  /**
   * I read the words.txt file and fetch all anagrams for the
   * wordToCompare
   *
   * @param wordToCompare
   * @return List[String] anagrams
   */
  def getAnagramsForWord(wordToCompare:String): List[String] ={
    val anagrams = loadFileFromResources()
      .map(_.toLowerCase())
      .filter(_.sorted.equals(wordToCompare.toLowerCase.sorted))
    anagrams
  }

  /**
   * I load the dictionary file from the pre configured location
   *
   * @return List[String]
   */
  private def loadFileFromResources():List[String] ={
    val file = Source.fromFile(resourceLocation)
    val lines = file.getLines().filter(!_.isEmpty).toList
    lines
  }

}
