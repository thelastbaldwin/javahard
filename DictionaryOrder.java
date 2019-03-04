import java.util.Scanner;

public class DictionaryOrder {
  private static void compareLanguages(String a, String b) {
    String lowera = a.toLowerCase();
    String lowerb = b.toLowerCase();

    if (lowera.compareTo(lowerb) < 0)
      System.out.println(lowera + " comes BEFORE " + lowerb);
    if (lowera.compareTo(lowerb) == 0)
      System.out.println(b + " isn't a made-up language!");
    if (lowera.compareTo(lowerb) > 0)
      System.out.println(lowera + " comes AFTER " + lowerb);
  }

  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String name;

    System.out.print("Make up the name of a programming language! ");
    name = keyboard.nextLine();

    compareLanguages(name, "c++");
    compareLanguages(name, "go");
    compareLanguages(name, "java");
    compareLanguages(name, "lisp");
    compareLanguages(name, "python");
    compareLanguages(name, "ruby");
    compareLanguages(name, "visualbasic");
  }
}