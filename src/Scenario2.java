public class Scenario2 {
    public static long power(long base, int exp){
        if(exp==0){
            return 1;
        }else{
            return base*power(base,exp-1);
        }
    }

    public static void main(String[] args){
        long b=3;
        int e=4;
        long sonuc=power(b,e);
        System.out.println(b+"^"+e+" = "+sonuc);
    }
}
