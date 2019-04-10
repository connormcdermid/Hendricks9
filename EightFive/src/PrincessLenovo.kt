/*
  author: Frank Gomes
  lab: 8.5 Lenore Decipher Program
  date: 09-04-19
  extra: spells "AirPods"
 */

fun main() {
    // Array for the code
    val codeWords = arrayOf("AH3ae","LaePlc","QptAr","BrCiot","5mOst","G3eHt","Sheb","W4B6yT","7S4X","aaeSa")
    // Prints for every item in the array
    for (i in 0 until codeWords.size) {
        when (i % 2) {
            // i % 2 will equal 1 if the codeword is odd
            1 -> {
                print(codeWords[i].get(2))
                print(codeWords[i].get(4))
            }
            // i % 2 will equal 0 is the codeword is even
            0 -> print(codeWords[i].get(1))
        }

    }
    // A
    print("\n" + codeWords[0].get(0))
    // i
    print(codeWords[3].get(3))
    // r
    print(codeWords[3].get(1))
    // P
    print(codeWords[1].get(3))
    // o
    print(codeWords[3].get(4))
    // d
    print(codeWords[0].get(3) + 3)
    // s
    print(codeWords[4].get(3))
}