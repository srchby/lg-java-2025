import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        
    }
    
    public static void checkWeather(ArrayList<Integer> nums) {
        ArrayList<Integer> coldDays = new ArrayList<>();
        ArrayList<Integer> hotDays = new ArrayList<>();
        
        int heatWave = 0;
        boolean consecutiveHeat = false;
        for (Integer num : nums) {
            
            if (!(num >= 30)) {
                consecutiveHeat = false;
                heatWave = 0;
            }

            if (num >= 30 && consecutiveHeat) {
                heatWave++;
            } if (num >= 30 && !(consecutiveHeat)) {
                heatWave++;
                consecutiveHeat = true;
            }

            if (num < 10) {
                coldDays.add(num);
            } else if (num > 35) {
                coldDays.add(num);
            } 
        }
        System.out.print("Dias muito frios: ");
        for (int day : coldDays) {
            System.out.print(day + " ");
        }
        System.out.println();
        System.out.print("Dias muito quentes: ");
        for (int day : hotDays) {
            System.out.print(day + " ");
        }
        System.out.println("Maior temperatura: " + Collections.max(nums));
        System.out.println("Menor temperatura: " + Collections.min(nums));
        if (heatWave >= 3) System.out.println("Alerta de onda de calor!");
    }
}
