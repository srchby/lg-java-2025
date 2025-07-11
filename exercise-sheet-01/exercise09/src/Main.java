import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double height = Double.parseDouble(scan.nextLine());
        System.out.println("Sexo (M/F): ");
        char sex = scan.nextLine().toUpperCase().charAt(0);
        
        double idealWeight = 0.0;
        if (sex == 'M') {
            idealWeight = (72.7 * height) - 58;
        } else if (sex == 'F') {
            idealWeight = (62.1 * height) - 44.7;
        }
        
        System.out.println("Peso ideal: " + idealWeight + " kg");
        scan.close();
    }
}