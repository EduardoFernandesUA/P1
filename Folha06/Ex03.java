import java.util.Scanner;

public class Ex03 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        int seq[] = new int[50]; // sequencia
        getSeq(seq);
        getAndExecOptionFunc(seq);   
    }

    public static void getAndExecOptionFunc(int[] seq){
        System.out.print("\n\n");
        System.out.print("MENU - Escolha uma opção\n");
        System.out.print(" 1 - Ler uma sequência de números inteiros\n");
        System.out.print(" 2 - Escrever a sequência\n");
        System.out.print(" 3 - Calcular o máximo da sequência\n");
        System.out.print(" 4 - Calcular o mínimo da sequência\n");
        System.out.print(" 5 - Calcular a média da sequência\n");
        System.out.print(" 6 - Detetar se é uma sequência só constituída por números pares\n");
        System.out.println("10 - Terminar o programa\n");
        System.out.print("Opção -> ");
        int option = KB.nextInt();
        System.out.print("\n");
        switch(option){
            case 1:
                getSeq(seq);
                break;
            case 2:
                printSeq(seq);
                break;
            case 3:
                max(seq);
                break;
            case 4:
                min(seq);
                break;
            case 5:
                avg(seq);
                break;
            case 6:
                parSeq(seq);
                break;
            case 10:
                endProg();
                break;
            default:
                System.out.print("\nBad input. Try again: ");
                getAndExecOptionFunc(seq);
                return;
        }
        
        pressEnterKeyToContinue();
        
        getAndExecOptionFunc(seq);
    }

    public static void getSeq(int[] seq){
        for(int i=0; i<seq.length ;i++){
            System.out.printf("Introduza o %dº número: ", i+1);
            seq[i] = KB.nextInt();
            if( seq[i]==0 ) break;
        }
    }

    public static void printSeq(int[] seq){
        for(int i=0; i<seq.length ;i++){
            if( seq[i]==0 ) break;
            System.out.printf("%2dº -> %d\n", i, seq[i]);
        }
    }

    public static void max(int[] seq){
        int currMax = Integer.MIN_VALUE;
        for(int i=0; i<seq.length&&seq[i]!=0 ;i++){
            currMax = seq[i]>currMax ? seq[i] : currMax;
        }
        System.out.printf("O valor máximo é %d", currMax);
    }

    public static void min(int[] seq){
        int currMin = Integer.MAX_VALUE;
        for(int i=0; i<seq.length&&seq[i]!=0 ;i++){
            currMin = seq[i]<currMin ? seq[i] : currMin;
        }
        System.out.printf("O valor minimo é %d", currMin);
    }

    public static void avg(int[] seq){
        double soma = 0;
        int i = 0;
        for(i=0; i<seq.length&&seq[i]!=0 ;i++){
            soma += seq[i];
        }
        System.out.printf("O valor médio é %.2f", soma/(double)i);
    }

    public static void parSeq(int[] seq){
        boolean par = true;
        for(int i=0; i<seq.length&&seq[i]!=0 ;i++){
            if( seq[i]%2==1 ){
                par = false;
                break;
            }
        }
        if( par ){
            System.out.print("A função é composta apenas por números pares.");
        }else{
            System.out.print("A função não é composta apenas por números pares.");
        }
    }

    public static void endProg(){
        System.exit(1);
    }

    public static void pressEnterKeyToContinue()
    { 
        System.out.print("\n\nPress Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    }
}
