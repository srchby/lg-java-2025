package Main.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList<>();

    System.out.println("Insira 10 números: ");

    for (int i = 0; i < 10; i++) {
      nums.add(sc.nextInt());
    }

    System.out.println("Números Pares:");
    nums.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
    System.out.println("Números Impares:");
    nums.stream().filter(n -> n % 2 != 0).forEach(n -> System.out.println(n));
    sc.close();
  }
}
