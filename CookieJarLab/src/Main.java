/*
  author: Frank Gomes
  lab: Cookie Jar Lab
  date: 24-09-19
  extra: Throws CookieOverflowException if user adds too many cookies
 */

class Main {
    public static void main(String[] args){
        // Make a new jar
        CookieJar jar = new CookieJar(300);
        // Test functions of jar
        try {
            jar.addCookies(120);
        } catch (CookieJar.CookieOverflowException e) {
            e.printStackTrace();
        }
        // Output jar's stats
        System.out.println("Space used: " + jar.spaceUsed);
        System.out.println("Space left: " + jar.spaceLeft());
        System.out.println("Full: " + jar.isFull());
        try {
            jar.addCookies(180);
        } catch (CookieJar.CookieOverflowException e) {
            e.printStackTrace();
        }
        // Output jar's stats
        System.out.println("Space used: " + jar.spaceUsed);
        System.out.println("Space left: " + jar.spaceLeft());
        System.out.println("Full: " + jar.isFull());
        try {
            jar.addCookies(20);
        } catch (CookieJar.CookieOverflowException e) {
            e.printStackTrace();
        }
        // Output jar's stats
        System.out.println("Space used: " + jar.spaceUsed);
        System.out.println("Space left: " + jar.spaceLeft());
        System.out.println("Full: " + jar.isFull());
    }
}