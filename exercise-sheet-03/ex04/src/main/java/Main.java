package main.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		System.out.println("Insira notas (-1 para parar): ");
		while (true) {
			int num = sc.nextInt();
			if (num == -1) {
				break;
			}
			nums.add(num);
		}
		System.out.println("Média: ");
		System.out.println(mediaNotas(nums));
		sc.close();
	}

	public static double mediaNotas(ArrayList<Integer> nums) {
		if (nums.isEmpty()) {
			return 0.0;
		}
		return nums.stream().mapToDouble(Integer::doubleValue).reduce(0.0, (a, b) -> a + b)
				/ nums.size();
	}
}
