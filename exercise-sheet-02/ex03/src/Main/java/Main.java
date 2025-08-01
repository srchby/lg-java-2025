package Main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Insira nota:");

        for (int i = 0; i < 5; i++) {
            numbers.add(Integer.parseInt(scan.nextLine()));
        }

        double average = numbers.stream().mapToDouble(n -> n).reduce(0, (a, b) -> a + b) / numbers.size();
        System.out.println(average);
    }
}
