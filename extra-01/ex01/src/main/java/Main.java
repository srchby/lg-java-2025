import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scan.nextLine());
            if (num == 0) {
                break;
            } 
            nums.add(num);
        }
        System.out.println("números positivos: ");
        nums.forEach(n -> {if (n >= 0) System.out.println(n);});
        System.out.println("números negativos: ");
        nums.forEach(n -> {if (n < 0) System.out.println(n);});
        System.out.println("média: ");
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        int average = sum / nums.size();
        System.out.println(average);
        scan.close();
    }
}
