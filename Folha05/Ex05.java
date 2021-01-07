import java.util.Scanner;

public class Ex05 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\n\nIntroduza largura do retangulo: ");
        int width = getIntRange(1, 100);
        System.out.print("Introduza altura do retangulo: ");
        int height = getIntRange(1, 100);

        System.out.print("\n");
        drawRectNoFill(width, height);
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

    public static void drawRectNoFill(int width, int height){
        for(int i=0; i<height ;i++){
            for(int j=0; j<width ;j++){
                if( i==0||j==0||i==height-1||j==width-1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
