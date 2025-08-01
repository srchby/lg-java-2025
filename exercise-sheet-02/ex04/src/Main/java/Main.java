package Main.java;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    int[] nums = { 21, 39, 87, 78, 4, 9 };
    Arrays.stream(nums).filter(n -> n > 10).forEach(System.out::println);
  }
}
