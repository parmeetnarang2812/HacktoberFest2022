/* 
import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    //  TLE -> checking twice for same pairs -> 12=>(1,12), (2,6), (3,4), (4,3), (6,2), (12,1)
    //     for (int i = 0; i < t; i++) {
    //       int n = scn.nextInt();
    //       int count = 0;
    //       for (int j = 1; j <= n; j++) {
    //         if (n % j == 0) {
    //           count++;
    //         }
    //       }
    //       if (count == 2) {
    //         System.out.println("prime");
    //       }
    //       else {
    //         System.out.println("not prime");
    //       }
    //     }
    

    //  TLE -> since checking for all factors, even 1 factor will make it not prime

    //     for (int i = 0; i < t; i++) {
    //       int n = scn.nextInt();
    //       int count = 0;
    //       for (int div = 2; div*div <= n; div++) {
    //         if (n % div == 0) {
    //           count++;
    //         }
    //       }
    //       if (count == 0) {
    //         System.out.println("prime");
    //       }
    //       else {
    //         System.out.println("not prime");
    //       }
    //     }
    

    for (int i = 0; i < t; i++) {
      int n = scn.nextInt();
      int count = 0;
      for (int div = 2; div * div <= n; div++) {
        if (n % div == 0) {
          count++;
          break;    // important
        }
      }
      if (count == 0) {
        System.out.println("prime");
      }
      else {
        System.out.println("not prime");
      }

    }

  }
}

*/