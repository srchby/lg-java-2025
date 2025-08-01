package Main.java;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Insira nota:");

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(scan.nextLine());
            numbers.add(num);
        }

        double sum = numbers.stream().mapToDouble(n -> n).sum();
        double average = sum / numbers.size();
        System.out.println(average);
    }
}
