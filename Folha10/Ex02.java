import java.util.Scanner;

public class Ex02 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        int[] key = generateKey();
        mostrarChave(key);

        System.out.println("\n\n");
    }

    public static int[] generateKey() {
        int[] key = new int[6];
        for (int i = 0; i < key.length; i++) {
            int n = -1;
            do {
                n = (int) Math.floor(Math.random() * 49 + 1);
            } while(pertenceChave(key,n));
            key[i] = n;
        }
        return key;
    }

    public static boolean pertenceChave(int[] key, int n) {
        boolean pertence = false;
        for (int i = 0; i < key.length; i++) {
            if( key[i] == n ) pertence = true;
        }
        return pertence;
    }

    public static void mostrarChave(int[] key) {
        System.out.println("\n\n     Aposta de totoloto");
        System.out.printf("Chave");
        for( int k : key ){
            System.out.print(", "+k);
        }
        System.out.print("\n\n");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                int n = i*7+j;
                if( pertenceChave(key,n) ) {
                    System.out.printf("   X");
                } else {
                    System.out.printf("  %2d", n);
                }
            }
            System.out.print("\n");
        }
    }
}
