import java.lang.reflect.Method;
import java.util.Scanner;

public class Ex04 {
    public static final Scanner KB = new Scanner(System.in);
    public static void main(String[] args) {
        Aluno[] turma = new Aluno[20];

        int option = -1;
        while(option!=0){
            System.out.println("Gestão de uma turma:");
            System.out.println("1 - Inserir informação da turma");
            System.out.println("2 - Mostrar informação de um aluno");
            System.out.println("3 - Alterar informação de um aluno");
            System.out.println("4 - Listar os alunos ordenados por nº mec.");
            System.out.println("5 - Listar os alunos ordenados por nota final");
            System.out.println("6 - Média das notas finais");
            System.out.println("7 - Melhor aluno");
            System.out.println("8 – Inserir pesos dos vários testes");
            System.out.println("0 - Terminar o programa");
            System.out.print("Opção? ");
            option = KB.nextInt();

            switch( option ) {
                case 1:
                    insert();
                    break;
            }
        }
    }

    public static void insert() {

    }
}

class Aluno {
    int nmec;
    String nome;
    int[] notasTestes = new int[3];
    int notaFinal;
}