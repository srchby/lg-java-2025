package Main.java;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] nums = {7,30,1,67,32,56,17,21,29,12}

    Arrays.stream(nums).filter(n -> n % 2 == 0).forEach(System.out::println);
  }
}
