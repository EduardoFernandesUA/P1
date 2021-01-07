import java.util.Scanner;

public class Ex03 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        String frase = "isto é 1 frase";
        System.out.println("A frase: \'"+frase+"\' tem "+countWords(frase)+" palavras");
    }

    public static int countWords(String frase) {
        int counter = 0;
        for (int i = 0; i < frase.length(); i++) {
            char character = frase.charAt(i);
            if( character==' '||character=='\n'||character=='\t' ){
                counter++;
            }
        }
        return counter+1;
    }
}
