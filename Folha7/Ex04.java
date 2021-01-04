import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex04 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("ex04Input.txt");
        Scanner fileScanner = new Scanner(file);
        int nLines = 0;
        while(fileScanner.hasNextLine()) {
            nLines++;
            fileScanner.nextLine();
        }
        fileScanner.close();

        fileScanner = new Scanner(file);
        String[] nomes = new String[nLines];
        String[][] notas = new String[nLines][3]; 
        int counter = 0;
        while(fileScanner.hasNext()) {
            nomes[counter] = fileScanner.next();
            notas[counter][0] = fileScanner.next();
            notas[counter][1] = fileScanner.next();
            notas[counter][2] = fileScanner.next();
            counter++;
        }
        fileScanner.close();

        String nmec = getnmec();

        printInfo(nmec, nomes, notas);
        
    }

    public static String getnmec(){
        System.out.print("\nIntroduza o nmec do aluno: ");
        return KB.next();
    }

    public static void printInfo(String nmec, String[] nomes, String[][] notas) {
        for(int i=0; i<notas.length ;i++) {
            if(notas[i][0].equals(nmec)){
                System.out.println("\n Nome       | nmec   | N1 | N2");
                System.out.println("-------------------------------");
                System.out.printf("%11s | %6s | %2s | %2s\n\n", nomes[i], notas[i][0], notas[i][1], notas[i][2]);
                break;
            }
        }
    }
}
