/*
  author: Frank Gomes
  lab: Cookie Jar Lab
  date: 24-09-19
  extra: Throws CookieOverflowException if user adds too many cookies
 */

class CookieJar {
    // Stats of jar
    final int size;
    int spaceUsed;

    // Constructor
    CookieJar(int capacity) {
        this.size = capacity;
    }

    // Put cookies in the jar
    void addCookies(int cookies) throws CookieOverflowException {
        this.spaceUsed += cookies;
        if (spaceUsed > size)
            throw new CookieOverflowException();
    }

    // CookieOverflowException - exception thrown when too many cookies are added
    static class CookieOverflowException extends Exception {
        public String toString() {
            return "You added too many cookies!";
        }
    }

    // Find out how much space is left in the jar
    int spaceLeft() {
        return size - spaceUsed;
    }

    // Check if jar is full
    boolean isFull() {
        return spaceUsed >= size;
    }
}
