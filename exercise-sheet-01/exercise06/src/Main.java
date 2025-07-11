import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Não entendi se deveriam ser inputs ou fixos, se forem inputs:
        // Boolean A = scan.nextLine().equalsIgnoreCase("true")?true:false;
        // Boolean B = scan.nextLine().equalsIgnoreCase("true")?true:false; 
        // Se forem fixos:
        Boolean A = true;
        Boolean B = false;

        if (A && B) {
            System.out.println("VERDADEIROS");
        } else if (!A && !B) {
            System.out.println("FALSOS");
        } else {
            System.out.println("Um VERDADEIRO e o outro FALSO");
        }
        scan.close();
    }
}