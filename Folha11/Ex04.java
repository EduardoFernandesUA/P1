import java.util.Scanner;

public class Ex04 {
    public static final Scanner KB = new Scanner(System.in);
    public static void main(String[] args) {
        Aluno[] turma = new Aluno[20];

        // test data
        turma[0] = new Aluno();
        turma[0].nmec = 102648;
        turma[0].nome = "Eduardo";
        turma[0].notasTestes[0] = 10;
        turma[0].notasTestes[1] = 15;
        turma[0].notasTestes[2] = 12.5;
        turma[0].notaFinal = (turma[0].notasTestes[0]+turma[0].notasTestes[1]+turma[0].notasTestes[2])/3;

        turma[1] = new Aluno();
        turma[1].nmec = 103456;
        turma[1].nome = "Curado";
        turma[1].notasTestes[0] = 9;
        turma[1].notasTestes[1] = 11;
        turma[1].notasTestes[2] = 10;
        turma[1].notaFinal = (turma[1].notasTestes[0]+turma[1].notasTestes[1]+turma[0].notasTestes[2])/3;

        turma[2] = new Aluno();
        turma[2].nmec = 99555;
        turma[2].nome = "Ferreiro";
        turma[2].notasTestes[0] = 12;
        turma[2].notasTestes[1] = 14;
        turma[2].notasTestes[2] = 13;
        turma[2].notaFinal = (turma[2].notasTestes[0]+turma[2].notasTestes[1]+turma[2].notasTestes[2])/3;

        int option = -1;
        while(option!=0){
            System.out.println("\nGestão de uma turma:");
            System.out.println("1 - Inserir informação da turma");
            System.out.println("2 - Mostrar informação de um aluno");
            System.out.println("3 - Alterar informação de um aluno");
            System.out.println("4 - Listar os alunos ordenados por nº mec.");
            System.out.println("5 - Listar os alunos ordenados por nota final");
            System.out.println("6 - Média das notas finais");
            System.out.println("7 - Melhor aluno");
            System.out.println("8 – Inserir pesos dos vários testes");
            System.out.println("9 - Gravar dados dos alunos num ficheiro");
            System.out.println("0 - Terminar o programa");
            System.out.print("Opção? ");

            option = KB.nextInt();

            switch( option ) {
                case 1:
                    insertTurma(turma);
                    break;
                case 2:
                    showAluno(turma);
                    break;
                case 3:
                    changeAluno(turma);
                    break;
                case 4:
                    listByNmec(turma);
                    break;
            }   
        }
    }

    public static void insertTurma(Aluno[] turma) {
        System.out.println("\n");
        for (int i = 0; i < turma.length; i++) {
            System.out.print("Aluno "+(i+1)+"º\n");

            turma[i] = new Aluno();

            System.out.print("\tnmec: ");
            turma[i].nmec = KB.nextInt();

            if(turma[i].nmec == 0) break;

            System.out.print("\tNome: ");
            KB.nextLine();
            turma[i].nome = KB.nextLine();

            System.out.print("\tNota 1: ");
            turma[i].notasTestes[0] = KB.nextDouble();
            System.out.print("\tNota 2: ");
            turma[i].notasTestes[1] = KB.nextDouble();
            System.out.print("\tNota 3: ");
            turma[i].notasTestes[2] = KB.nextDouble();

            turma[i].notaFinal = (turma[i].notasTestes[0]+turma[i].notasTestes[1]+turma[i].notasTestes[2])/3;
        }
    }

    public static void showAluno(Aluno[] turma) {
        System.out.print("\nNmec a procurar: ");
        int nmec = KB.nextInt();
        for (int i = 0; i < turma.length; i++) {
            if(turma[i].nmec == nmec){
                System.out.println("\nFicha de Aluno");
                System.out.printf("\tNome: %s\n", turma[i].nome);
                System.out.printf("\tNMec: %d\n", turma[i].nmec);
                System.out.printf("\tNotas: %.1f %.1f %.1f\n", turma[i].notasTestes[0], turma[i].notasTestes[1], turma[i].notasTestes[2]);
                System.out.printf("\tNota Final: %.1f\n", turma[i].notaFinal);
                break;
            }
        }
    }

    public static void changeAluno(Aluno[] turma){
        System.out.print("Introduza o nmec: ");
        int nmec = KB.nextInt();
        for (int i = 0; i < turma.length; i++) {
            if(turma)
            if(turma[i].nmec==nmec){
                System.out.print("\tNMec: ");
                turma[i].nmec = nmec;
                System.out.print("\tNome: ");
                turma[i].nome = KB.nextLine();
                System.out.print("\tNota 1: ");
                turma[i].notasTestes[0] = KB.nextDouble();
                System.out.print("\tNota 2: ");
                turma[i].notasTestes[1] = KB.nextDouble();
                System.out.print("\tNota 3: ");
                turma[i].notasTestes[2] = KB.nextDouble();
                turma[i].notaFinal = (turma[i].notasTestes[0]+turma[i].notasTestes[1]+turma[i].notasTestes[2])/3;
                break;
            }
        }
    }

    public static void listByNmec(Aluno[] turma) {
        int[] order = new int[turma.length];
        for (int i = 0; i < order.length; i++) {
            order[i] = i;
        }

        for (int i=0; i<order.length ;i++) {
            for (int j=1; j<order.length ;j++) {
                if( turma[order[j]].nmec < turma[order[j-1]].nmec ) {
                    int temp = order[i];
                    order[i] = order[j];
                    order[j] = temp;
                }
            }
        }

        for (int i = 0; i < order.length; i++) {
            System.out.println("Ficha de Aluno");
            System.out.printf("\tNome: %s\n", turma[order[i]].nome);
            System.out.printf("\tNMec: %d\n", turma[order[i]].nmec);
            System.out.printf("\tNotas: %.1f %.1f %.1f\n", turma[order[i]].notasTestes[0], turma[order[i]].notasTestes[1], turma[order[i]].notasTestes[2]);
            System.out.printf("\tNota Final: %.1f\n", turma[order[i]].notaFinal);
        }
    }
}

class Aluno {
    int nmec;
    String nome;
    double[] notasTestes = new double[3];
    double notaFinal;
}