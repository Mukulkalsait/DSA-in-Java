import java.util.*;

public class JFO_1_2_PrimeCheck {

  public static boolean isPrime(int a) {
    for (int i = 2; i < Math.sqrt(a); i++) {
      if (a % i == 0) {
        return false;
      }
      return true;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please inter number:");
    int num = sc.nextInt();
    System.out.println(isPrime(num));

  }
}
