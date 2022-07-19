# boaanagramtest

The application takes an argument of type String as part of a commandline argument and prints out all the anagrams against the stored dictionary file.

To run this application, run the following command from the project root directory and follow the instructions

sbt run src/main/scala/AnagramChecker.scala

To run the tests use the command from the root directory

sbt test

NOTE: When you run sbt run, its throwing an error relating to sbt assembly, I did not spend more time to fix that due to time constraints but the functionality is there with the tests.
