import java.util.Scanner;

public class Ex03 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\nIntroduza mês: ");
        int mes = getIntRange(1, 12);
        System.out.print("Introduza ano: ");
        int ano = getIntPos();

        int dias = getDias(mes, ano);
        System.out.printf("\nO mês %d do ano %d tem %d dias.\n\n",mes,ano,dias);
    }

    public static int getDias(int mes, int ano){
        if( mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 ){
            return 31;
        }else if( mes==4 || mes==6 || mes==9 || mes==11 ){
            return 30;
        }else{
            return 28 + anoBisseixto(ano);
        }
    }

    public static int anoBisseixto(int ano){
        if( ano%400==0 || (ano%4==0 && ano%100!=0)){
            return 1;
        }else{
            return 0;
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

    public static int getIntPos(){
        int n = 0;
        do{
            n = KB.nextInt();
        }while( n<=0 );
        return n;
    }
}
