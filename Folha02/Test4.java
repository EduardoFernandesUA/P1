import java.util.Scanner;

public class Test4 {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 3;

        for(int i=0;i<5;i++){
            if( i==n ){
                continue;
            }else{
                System.out.println("!=");
            }
            func();
        }
    }

    public static void func(){
        System.out.println("----");
        return;
    }
}
