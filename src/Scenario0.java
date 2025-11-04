import java.util.*;
public class Scenario0 {
    public static int factorial(int a){
        if (a == 0){
            return 1;
        }else{
              return a * factorial(a-1);
            }
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("faktorıyelını almak ıstedgınız sayıyı gırın.");
        int a = sc.nextInt();
        int fac = factorial(a);
        System.out.println("faktöriyelini aldıgınız sayı: "+a+" faktöriyeli: "+fac);
    }

    }