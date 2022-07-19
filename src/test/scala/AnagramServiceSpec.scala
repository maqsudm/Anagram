import org.scalatest.flatspec.AnyFlatSpec

class AnagramServiceSpec  extends AnyFlatSpec{

  trait Scope{
    val anagramService = new AnagramService("src/test/resources/words.txt")
  }

  "A call to getAnagramsForWord  with word Abbe" should
    "return all anagrams for it from words text file in test repository" in new Scope {
    val word = "Abbe";
    assert(anagramService.getAnagramsForWord(word).length == 5)
    assert(anagramService.getAnagramsForWord(word).equals(List("abbe", "babe", "ebba", "beba", "abeb")))
  }

  "A call to getAnagramsForWord with word bored" should
    "return all anagrams for it from words text file in test repository" in new Scope {
    val word = "bored";
    assert(anagramService.getAnagramsForWord(word).length == 4)
    assert(anagramService.getAnagramsForWord(word).equals(List("bored", "robed", "debor", "dober")))
  }

  "A call to getAnagramsForWord with word night" should
    "return all anagrams for it from words text file in test repository" in new Scope {
    val word = "night";
    assert(anagramService.getAnagramsForWord(word).length == 2)
    assert(anagramService.getAnagramsForWord(word).equals(List("night", "thing")))
  }

  "A call to getAnagramsForWord  with word test" should
    "return zero anagrams for it from words text file in test repository" in new Scope {
    val word = "test";
    assert(anagramService.getAnagramsForWord(word).length == 0)
    assert(anagramService.getAnagramsForWord(word).equals(List()))
  }

}
