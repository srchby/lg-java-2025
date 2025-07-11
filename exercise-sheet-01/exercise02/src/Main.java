import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      Scanner scan = new Scanner(System.in);
      String name = scan.nextLine();
      char sex = scan.nextLine().charAt(0);
      String civilState = scan.nextLine();
      if (sex == 'f' && civilState.toLowerCase().equals("casada")) {
         int yearsMarried = Integer.parseInt(scan.nextLine());
         System.out.println(yearsMarried);
      }

      scan.close();
   }
}
