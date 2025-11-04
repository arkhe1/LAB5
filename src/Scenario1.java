import java.util.*;

public class Scenario1 {
    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return (n % 10) + sumDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Basamaklarını toplamak istediğiniz sayıyı girin: ");
        int a = sc.nextInt();
        System.out.println(a + " sayısının basamakları toplamı: " + sumDigits(a));
        sc.close();
    }
}
