import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        char sex = scan.nextLine().charAt(0);
        String civil = scan.nextLine();
        if (sex == 'f' && civil.toLowerCase().equals("casada")) {
            int marriedYears = Integer.parseInt(scan.nextLine());
            System.out.println(marriedYears);
        }
        scan.close();
    }
}