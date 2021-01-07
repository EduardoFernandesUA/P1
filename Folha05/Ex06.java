import java.util.Scanner;

public class Ex06 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\n\nIntroduza número: ");
        int n = getIntRange(1, 99);

        System.out.print("\n\n");
        drawTabuada(n);
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

    public static void drawTabuada(int n){
        System.out.print("-------------------\n");
        System.out.printf("|  Tabuada dos %2d |\n", n);
        System.out.print("-------------------\n");
        for(int i=1; i<=10 ;i++){
            System.out.printf("| %2d x %2d  |  %3d |\n", n, i, n*i);
        }
        System.out.print("-------------------");
    }
}
