import java.util.Scanner;
import java.io.*;

class Ex01{
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        File file;
        do{
            // pedir nome do ficheiro
            System.out.print("\nIntroduza o nome do ficheiro: ");
            String fileName = KB.nextLine();

            // criar referencia de ficheiro com o nome introduzido
            file = new File(fileName);
        }while( !validFile(file) );
            

        // leitura do ficheiro
        String fileData = readFile(file);

        // output do ficheiro
        System.out.println("\n"+fileData);

    }

    public static boolean validFile(File file) {
        // verificações pedidas no enunciado
        if(!file.isFile()){
            System.err.println("ERRO: '"+file.getName()+"' não é um ficheiro.");
            return false;
        }
        if(!file.canRead()){
            System.err.println("ERRO: '"+file.getName()+"' sem permissão de leitura.");
            return false;
        }
        return true;
    }

    public static String readFile(File file) throws FileNotFoundException {
        String fileData = "";

        Scanner fileScan = new Scanner(file);
        while(fileScan.hasNextLine()){
            fileData += fileScan.nextLine()+"\n";
        }
        fileScan.close();

        return fileData;
    }
}