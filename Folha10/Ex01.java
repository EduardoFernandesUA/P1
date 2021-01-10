import java.io.*;
import java.util.Scanner;

public class Ex01 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        int seq[] = new int[50]; // sequencia
        //getSeq(seq);
        getAndExecOptionFunc(seq);   
    }

    public static void getAndExecOptionFunc(int[] seq) throws FileNotFoundException {
        System.out.print("\n\n");
        System.out.print("MENU - Escolha uma opção\n");
        System.out.print(" 1 - Ler uma sequência de números inteiros\n");
        System.out.print(" 2 - Escrever a sequência\n");
        System.out.print(" 3 - Calcular o máximo da sequência\n");
        System.out.print(" 4 - Calcular o mínimo da sequência\n");
        System.out.print(" 5 - Calcular a média da sequência\n");
        System.out.print(" 6 - Detetar se é uma sequência só constituída por números pares\n");
        // Adições do Ex. 7.3 
        System.out.print(" 7 - Ler uma sequência de números de um ficheiro de texto\n");
        System.out.print(" 8 - Adicionar números à sequência existente\n");
        System.out.print(" 9 - gravar a sequencia atual de números num ficheiro\n");

        // Adições do Ex. 10.1 
        System.out.print("10 - Ordenar a sequência por ordem crescente utilizando ordenação sequencial\n");
        System.out.print("11 - Ordenar a sequência por ordem decrescente utilizando ordenação por flutuação\n");
        System.out.print("12 - Pesquisa de valor na sequência\n");

        System.out.println("13 - Terminar o programa\n");
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
            case 7:
                readFileSeq(seq);
                break;
            case 8:
                addNumbersSeq(seq);
                break;
            case 9:
                saveSeq(seq);
                break;
            case 10:
                ordCres(seq);
                break;
            case 11:
                ordDecr(seq);
                break;
            case 12:
                searchSeq(seq);
                break;
            case 13:
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

    public static void getSeq(int[] seq){  // Option: 1
        for(int i=0; i<seq.length ;i++){
            System.out.printf("Introduza o %dº número: ", i+1);
            seq[i] = KB.nextInt();
            if( seq[i]==0 ) break;
        }
    }

    public static void printSeq(int[] seq){ // Option: 2
        for(int i=0; i<seq.length ;i++){
            if( seq[i]==0 ) break;
            System.out.printf("%2dº -> %d\n", i, seq[i]);
        }
    }

    public static void max(int[] seq){ // Option: 3
        int currMax = Integer.MIN_VALUE;
        for(int i=0; i<seq.length&&seq[i]!=0 ;i++){
            currMax = seq[i]>currMax ? seq[i] : currMax;
        }
        System.out.printf("O valor máximo é %d", currMax);
    }

    public static void min(int[] seq){ // Option: 4
        int currMin = Integer.MAX_VALUE;
        for(int i=0; i<seq.length&&seq[i]!=0 ;i++){
            currMin = seq[i]<currMin ? seq[i] : currMin;
        }
        System.out.printf("O valor minimo é %d", currMin);
    }

    public static void avg(int[] seq){ // Option: 5
        double soma = 0;
        int i = 0;
        for(i=0; i<seq.length&&seq[i]!=0 ;i++){
            soma += seq[i];
        }
        System.out.printf("O valor médio é %.2f", soma/(double)i);
    }

    public static void parSeq(int[] seq){ // Option: 6
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

    public static void readFileSeq(int[] seq) throws FileNotFoundException { // Option: 7
        // pedir nome do ficheiro
        System.out.print("\nIntroduza o nome do ficheiro: ");
        String fileName = KB.next();

        // criar referencia de ficheiro com o nome introduzido
        File file = new File(fileName);

        // ler numeros
        String fileData = "";
        Scanner fileScan = new Scanner(file);
        while(fileScan.hasNextLine()){
            fileData += fileScan.nextLine()+" ";
        }
        fileScan.close();
        // criar array com os valores
        String[] fileDataArray = fileData.split(" "); // divide a string nos espaços
        for(int i=0; i<seq.length ;i++){
            if( i<fileDataArray.length ) {
                seq[i] = Integer.parseInt(fileDataArray[i]);
            } else {
                seq[i] = 0;
            }
        }

        System.out.println("Valores lidos do ficheiro com sucesso!");
    }

    public static void addNumbersSeq(int[] seq) { // Option: 8
        KB.nextLine();
        // find first 0
        int index=0;
        for(index=0; index<seq.length ;index++) {
            if( seq[index]==0 ) break;
        }
        System.out.print("Introduza uma lista de numeros separados por virgulas: ");
        String[] inputs = KB.next().split(",");
        for(int i=index; i<index+inputs.length&&i<50 ;i++) {
            seq[i] = Integer.parseInt(inputs[i-index]);
        }
        System.out.println("Numeros lidos com sucesso!");
    }

    public static void saveSeq(int[] seq) throws FileNotFoundException { // Option: 9
        File fileOut = new File("outputNumbers.txt");
        PrintWriter pw = new PrintWriter(fileOut); 

        // escreve array com as linhas no ficheiro de escrita
        for(int i = 0 ; i<seq.length&&seq[i]!=0 ; i++) {
            pw.println(seq[i]);
        }
        pw.close();
    }

    public static void ordCres(int[] seq) {
        // get end of list
        int index=0;
        for(index=0; index<seq.length ;index++) {
            if( seq[index]==0 ) break;
        }

        for (int i=0; i<index-i ;i++) {
            for (int j=1; j<index ;j++) {
                if( seq[j]<seq[j-1] ) {
                    int temp = seq[j];
                    seq[j] = seq[j-1];
                    seq[j-1] = temp;
                }
            }
        }
    }

    public static void ordDecr(int[] seq) {
        // get end of list
        int index=0;
        for(index=0; index<seq.length ;index++) {
            if( seq[index]==0 ) break;
        }

        for (int i=0; i<index-i ;i++) {
            for (int j=1; j<index ;j++) {
                if( seq[j]>seq[j-1] ) {
                    int temp = seq[j];
                    seq[j] = seq[j-1];
                    seq[j-1] = temp;
                }
            }
        }
    }

    public static void searchSeq(int[] seq) {
        for(int i=0; i<seq.length ;i++) {
            
        }
    }

    public static void endProg(){ // Option: 13
        System.exit(1);
    }

    public static void pressEnterKeyToContinue() { 
        System.out.print("\n\nPress Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    }
}
