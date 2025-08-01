import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] arr = { 5, 8, 12, 3, 9 };

    Arrays.stream(arr).forEach(n -> System.out.println(n));
  }
}
