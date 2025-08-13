package main.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] nums = { 1, 6, 8, 2, 5 };
		System.out.println(mediaNotas(nums));
	}

	public static double mediaNotas(Double[] nums) {
		return Arrays.stream(nums).mapToDouble(Double::doubleValue).reduce(0.0, (a, b) -> a + b)
				/ (double) nums.length;
	}
}
