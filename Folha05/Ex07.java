import java.util.Scanner;

public class Ex07 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\n\nIntroduza a: ");
        int a = getIntRange(1, Integer.MAX_VALUE);
        System.out.print("Introduza b: ");
        int b = getIntRange(1, Integer.MAX_VALUE);

        System.out.print("\n");
        System.out.printf("MDC = %d", mdc(a, b));
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

    public static int mdc(int a, int b){
        if(b==0){
            return a;
        }else{
            return mdc(b, a%b);
        }
    }
}
