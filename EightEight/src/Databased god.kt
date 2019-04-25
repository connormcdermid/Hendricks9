import kotlin.system.exitProcess

fun main() {
    val nameArray = arrayOf("Barney Fife", "Luke Skywalker", "Cruella Deville", "Sally Smith", "Marsha Brady", "Gomez Addams", "John Adams", "Marie Antoinette", "Albert Einstein", "Mick Jagger", "Mickey Mouse")
    val addressArray = arrayOf("10 Warbler Rd.", "R2 Death Star Ave.", "123 Witchey Way", "3862 Street Blvd.", "1970 Groovy Street", "1 Spooky Circle", "3445 Presidential Plaza", "2 Rue Morgue", "7 Relativity Rd.", "100 Rolling Stone Path", "2 Disney Lane")
    val cityArray = arrayOf("Mountainville, SC 34765", "Jupiter, MD 44623", "Hollywood, CA 12345", "Springfield, IL 31733", "Arlington, VA 51266", "Tombstone, AZ 63341", "New York, NY 11220", "New Orleans, LA 25993", "Topeka, KS 63121", "Seattle, WA 23733", "Orlando, FL 72272")
    println("What would you like to do?\n 1. Display by last name\n 2. Display by city name\n 3. Display by Zip Code\n 4. Quit")
    when (readLine()!!) {
        "1" -> lastName(nameArray, addressArray, cityArray)


        "4" -> exitProcess(0)
    }
}

fun lastName(nameArray: Array<String>, addressArray: Array<String>, cityArray: Array<String>) {
    val lastNameArray = Array(nameArray.size) {""}
    for (i in 0 until nameArray.size)
        lastNameArray[i] = nameArray[i].substringAfter(' ')

}