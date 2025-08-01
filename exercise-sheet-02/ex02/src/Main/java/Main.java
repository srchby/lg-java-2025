package Main.java;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    int[] nums = { 4, 7, 2, 47 };
    int sum = 0;

    for (int n : nums) {
      sum += n;
    }

    System.out.println(sum);
  }
}
