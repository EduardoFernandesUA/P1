import java.util.Scanner;

public class Ex06 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        Temperaturas temps = new Temperaturas();

        for(int i=0; i<5 ;i++){
            System.out.printf("Dia %d\n", i+1);
            temps.temps[i] = readTemp();
        }

        int iAmplMax = 0;
        System.out.printf("\n| Dia | Min | Max | Ampl |\n");
        for(int i=0; i<temps.temps.length ;i++){
            System.out.printf("| %3d | %3d | %3d | %4d |\n", i+1, temps.temps[i][0],temps.temps[i][1],temps.temps[i][2]);
            if(temps.temps[i][2]>temps.temps[iAmplMax][2]) iAmplMax = i;
        }
        System.out.printf("A amplitude máxima de %2d ocurreu no dia %d\n\n", temps.temps[iAmplMax][2], iAmplMax+1);
    }

    public static int[] readTemp(){
        int tMin, tMax;
        do{
            System.out.print("Min: ");
            tMin = KB.nextInt();
            System.out.print("Máx: ");
            tMax = KB.nextInt();
        }while( tMin<-20 || tMax>50 || tMax<tMin );

        int[] temp = {tMin,tMax,tMax-tMin};
        return temp;
    }
}

class Temperaturas {
    int[][] temps = new int[5][3];
}
