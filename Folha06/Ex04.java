import java.util.Scanner;

public class Ex04 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\n\nIntroduza número de notas que pretende utilizar: ");
        int n = getIntRange(1, Integer.MAX_VALUE);

        int notas[] = new int[21];
        int max = 0;
        for(int i=0; i<n ;i++){
            System.out.printf("Nota %2dº: ", i+1);
            int a = getIntRange(1, 20);
            notas[a]++;
            if( notas[a]>max ) max = notas[a];
        }

        System.out.print("\nHistograma de notas");
        System.out.print("\n-------------------------------------------------------");
        for(int i=20; i>=0 ;i--){
            System.out.printf("\n%2d | ", i);
            printNchar('*', (int)Math.round(((double)notas[i]/(double)max)*50));
        }
        

        System.out.print("\n\n");
    }

    public static void printNchar(char c, int n){
        for(int i=0;i<n;i++){
            System.out.print(c);
        }
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
