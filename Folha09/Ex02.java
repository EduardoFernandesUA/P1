import java.util.Scanner;

public class Ex02 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Introduza as frases:");
        String[] frases = new String[50];
        for(int i=0; i<frases.length ;i++) {
            frases[i] = KB.nextLine();
            if( frases[i].length()==0 ) break;
        }

        for(int i=0; i<frases.length ;i++){
            if( frases[i].length()==0) break;
            System.out.printf("%2d -> %s\n", i, acronimo(frases[i]));
        }

    }

    public static String acronimo(String frase) {
        String output = "";
        for (int i=0; i<frase.length() ;i++) {
            output += Character.isUpperCase(frase.charAt(i)) ? frase.charAt(i) : "";
        }
        return output;
    }
}
