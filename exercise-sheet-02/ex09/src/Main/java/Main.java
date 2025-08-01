package Main.java;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums = { 34, 674, 213, 768, 243 };
    int[] newNums = Arrays.stream(nums).map(n -> n * 2).toArray();
    Arrays.stream(newNums).forEach(n -> System.out.println(n));
  }
}
