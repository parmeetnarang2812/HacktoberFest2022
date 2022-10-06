/* 
import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int low = s.nextInt();
    int high = s.nextInt();

    for (int i = low; i <= high; i++) {
      int count = 0;
      for (int div = 2; div * div <= i; div++) {
        if (i % div == 0) {
          count++;
          break;    // important
        }
      }
      if (count == 0) {
        System.out.println(i);
      }
    }

  }
} 
*/