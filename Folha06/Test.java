import java.util.Arrays;
import java.util.Scanner;

class Test {
    public static final Scanner AT = new Scanner(System.in);

    public static void main(String[] args){
        System.out.printf("How many grades are you going enter\n");
        int n = Intervalo(1, 50);
        int[] grades = new int[21];
        Arrays.fill(grades, 0);

        for(int i = 0; i < n; i++){ // input
            System.out.printf("Enter your grades: ");
            int carry = AT.nextInt();
            if(carry < 0 || carry > 20){
                System.out.printf("Your grade must be between 0 and 20");
                carry = AT.nextInt();
            }
            grades[carry]++;
        }

        System.out.printf("\nHistograma de notas");
        System.out.printf("\n-------------------------------------------------------");
        for(int j = 20; j >= 0; j--){
            System.out.printf("\n%2d | ", j);
            Historiograma('*', grades[j]);
        }
        System.out.print("\n\n");
    }
    
    public static void Historiograma(char c, int d){
        for(int i = 0; i < d; i++){
            System.out.print(c);
        }
    }

    public static int Intervalo(int min, int max){
        int n = AT.nextInt();
        while(n < min || n > max){
            System.out.printf("The maximum number of grades is 50\n");
            n = AT.nextInt();
        }
        return n;
    }
}
