import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int number = Integer.parseInt(scan.nextLine());
        if (number % 2 == 0) {
            System.out.println("Par.");
        } else {
            System.out.println("Ímpar.");
        }
        
        scan.close();
    }
}