import java.util.*;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int cnt = 0;
    while (n != 0) {
      n /= 10;
      cnt++;
    }
    System.out.print(cnt);
  }
  
}