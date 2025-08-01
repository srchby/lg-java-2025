package Main.java;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] names = { "ulysses", "romanov", "albert", "antonio", "tolstoy" };
    String name = sc.nextLine();

    for (String n : names) {
      if (n.equals(name)) {
        System.out.println("Nome achado.");
      }
    }

  }
}
