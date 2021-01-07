import java.util.Scanner;

public class Test3 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        double s = 0;
        for(int i=1;i<=5;i++){
            if(i%2==0){
                s=s+1.0/i;
            }
        }
        System.out.print(s);

        System.out.print("");
    }
}
