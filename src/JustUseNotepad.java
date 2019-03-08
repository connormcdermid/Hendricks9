/*
  author: Frank Gomes
  lab: 7.1 Create Files
  date: 07-03-19
  extra: Asks user if it is okay to overwrite files
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;

public class JustUseNotepad {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("Course.txt", "UTF-8");
        } catch (FileNotFoundException e) {
            System.out.println("Could not create file. Error: " + e);
        } catch (FileAlreadyExistsException ee) {
            System.out.println("This file already exists. Is it okay to overwrite it? (Y/N)");

        }
    }
}
