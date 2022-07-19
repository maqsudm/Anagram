import scala.io.Source

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
   * We could pass this as a value when a proper IoC framework is added as dependecncy
   * for the sake of this test I am hardcoding it for time constraints.
   * @return List[String]
   */
  private def loadFileFromResources():List[String] ={
    val file = Source.fromFile(resourceLocation)
    val lines = file.getLines().filter(!_.isEmpty).toList
    lines
  }

}
