import java.util.Scanner;

class Ex01 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n\nAnálise de uma frase");
        System.out.print("Frase de entrada -> ");
        String frase = KB.nextLine();

        int lowerCount = 0, upperCount = 0, numCount = 0, vowCount = 0, conCount = 0;

        for(int i=0; i<frase.length() ;i++){
            lowerCount += Character.isLowerCase(frase.charAt(i)) ? 1 : 0;
            upperCount += Character.isUpperCase(frase.charAt(i)) ? 1 : 0;
            numCount += Character.isDigit(frase.charAt(i)) ? 1 : 0;
            vowCount += Character.isLetter(frase.charAt(i)) && isVowel(frase.charAt(i)) ? 1 : 0;
            conCount += Character.isLetter(frase.charAt(i)) && !isVowel(frase.charAt(i)) ? 1 : 0;
        }

        System.out.printf("Número de catacteres minúsculos -> %2d\n", lowerCount);
        System.out.printf("Número de catacteres minúsculos -> %2d\n", upperCount);
        System.out.printf("Número de catacteres minúsculos -> %2d\n", numCount);
        System.out.printf("Número de vogais -> %2d\n", vowCount);
        System.out.printf("Número de consoantes -> %2d\n\n", conCount);
    }

    public static boolean isVowel(char c) {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}