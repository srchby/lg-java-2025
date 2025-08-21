import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] seats = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        while (true) {
            System.out.println("1. Reservar");
            System.out.println("2. Cancelar");
            System.out.println("3. Visualizar");
            System.out.println("4. Sair");
            String input = sc.nextLine().toLowerCase().trim();
            switch (input) {
                case "1":
                    System.out.println("Selecione o assento (1..10): ");
                    try {
                        int seatNum = sc.nextInt();
                        sc.nextLine();
                        if (seatNum > 0 && seatNum < 11) {
                            book(seats, seatNum);
                        } else {
                            System.out.println("Assento inválido");
                        }
                    } catch (Exception e) {
                        System.out.println("Assento inválido");
                        sc.nextLine();
                    }
                    break;
                case "2":
                    System.out.println("Selecione o assento (1..10): ");
                    try {
                        int seatNum = sc.nextInt();
                        sc.nextLine();
                        if (seatNum > 0 && seatNum < 11) {
                            cancel(seats, seatNum);
                        } else {
                            System.out.println("Assento inválido");
                        }
                    } catch (Exception e) {
                        System.out.println("Assento inválido");
                        sc.nextLine();
                    }
                    break;
                case "3":
                    printSeats(seats);
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Ação inválida");
                    break;
            }
        }
    }

    public static void book(int[] seats, int num) {
        seats[num - 1] = (seats[num - 1] == 0) ? 1 : 0;
        return;
    }

    public static void cancel(int[] seats, int num) {
        seats[num - 1] = (seats[num - 1] == 1) ? 0 : 1;
        return;
    }

    public static void printSeats(int[] seats) {
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Assento " + (i + 1) + ": " + (seats[i] == 0
                    ? "Vazio"
                    : seats[i] == 1 ? "Reservado" : "Inválido"));
        }
        System.out.println();
    }
}
