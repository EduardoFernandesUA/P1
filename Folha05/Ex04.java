import java.util.Scanner;

public class Ex04 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\nIntroduza n (1 a 10): ");
        int m = getIntRange(1, 10);

        for(int i=m; i>0 ;i--){
            System.out.printf("\n%d! = %d", i, fact(i));
        }

        System.out.print("\n\n");
    }

    public static int getIntRange(int min, int max){
        int n = KB.nextInt();
        while( n<min||n>max ){
            System.out.printf("Número inválido. Introduza inteiro (%d a %d): ",min,max);
            n = KB.nextInt();
        }
        return n;
    }

    public static int fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
}
