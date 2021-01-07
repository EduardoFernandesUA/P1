import java.util.Scanner;

public class Ex08 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\n\nIntroduza valor inicial de x: ");
        double xInicial = KB.nextDouble();
        System.out.print("Introduza valor final de x: ");
        double xFinal = KB.nextDouble();
        
        if(xInicial>xFinal){
            System.out.print("\nValores impossiveis de x!");
            return;
        }
        
        System.out.print("Introduza numero de elementos: ");
        int nElementos = getIntRange(2, Integer.MAX_VALUE);

        System.out.print("\n------------------------------------\n");
        System.out.print("|   x   | 5x2+10x+3 | 7x3+3x2+5x+2 |\n");
        System.out.print("------------------------------------\n");
        for(double i=xInicial; i<=xFinal ;i+=(xFinal-xInicial)/(nElementos-1)){
            System.out.printf("| %5.1f | %9.2f | %12.3f |\n", i, poly3(0, 5, 10, 3, i), poly3(7, 3, 5, 2, i));
            System.out.print("------------------------------------\n");
        }
    }

    public static double poly3(double a, double b, double c, double d, double x){
        return a*Math.pow(x,3) + b*Math.pow(x,2) + c*x + d;
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
