package Main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList<>();

    for (int i = 0; i < 7; i++) {
      nums.add(scan.nextInt());
    }

    System.out.println(Collections.max(nums));
    scan.close();
  }
}
