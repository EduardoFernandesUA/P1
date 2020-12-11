import java.util.Scanner;

public class ArrayFindMin {
    public static final Scanner KB = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduza número de números que pretende calcular: ");
        int tamanhoDoArray = KB.nextInt();

        int[] numeros = new int[tamanhoDoArray];
        for(int i=0; i<tamanhoDoArray ;i++){
            numeros[i] = KB.nextInt();
        }

        int min = numeros[0];
        for(int numero : numeros){
            if(numero<min){
                min = numero;
            }
        }

        System.out.printf("O menor número é %d\n", min);
    }
    
}