public class Test {
    public static void main(String[] args) {
        System.out.printf("\n\n");
        
        int x=2,y=3;
        System.out.println(questao5(x,y));
        
        System.out.printf("\n\n");
    }

    public static int questao5(int a, int b){
        int r=a;
        for(int i = 2;i<=b;i++){
            r=r+a;
        }
        return r;
    }
}
