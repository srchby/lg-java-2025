import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Identificação do aluno: ");
        int id = scanner.nextInt();
        System.out.print("Notas: ");
        double grade1 = scanner.nextDouble();
        double grade2 = scanner.nextDouble();
        double grade3 = scanner.nextDouble();
        
        System.out.print("Média: ");
        double average = scanner.nextDouble();
        
        double passAverage = (grade1 + grade2 * 2 + grade3 * 3 + average) / 7;
        
        String passLetter;
        if (passAverage >= 90) {
            passLetter = "A";
        } else if (passAverage >= 75) {
            passLetter = "B";
        } else if (passAverage >= 60) {
            passLetter = "C";
        } else if (passAverage >= 40) {
            passLetter = "D";
        } else {
            passLetter = "E";
        }
        
        System.out.println("Número do aluno: " + id);
        System.out.println("Notas: " + grade1 + ", " + grade2 + ", " + grade3);
        System.out.println("Média dos exercícios: " + average);
        System.out.println("Média de aproveitamento: " + passAverage);
        System.out.println("Aproveitamento: " + passLetter);
        
        if (passLetter.equals("A") || passLetter.equals("B") || passLetter.equals("C")) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        scanner.close();
    }    
}
