import java.util.Scanner;

public class Ex09 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\n\nIntroduza m: ");
        int m = getIntRange(1, Integer.MAX_VALUE);

        System.out.print("\nNúmeros Primos: \n");
        for(int i=1; i<=m ;i++){
            if( isprime(i) ){
                System.out.println(i);
            }
        }
        System.out.print("\n\n");
    }

    public static boolean isprime(int n){
        for(int i=2; i<n ;i++){
            if( n%i==0 ) return false;
        }
        return true;
    }

    public static int getIntRange(int min, int max){
        int n = KB.nextInt();
        while( n<min||n>max ){
            System.out.printf("Número inválido. Introduza inteiro (%d a %d): ",min,max);
            n = KB.nextInt();
        }
        return n;
    }
}
