import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int result;
        if (number >= 0) {
            result = number * 2;
        } else {
            result = number * 3;
        }        
        System.out.println(result);
        scan.close();
    }
}