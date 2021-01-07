public class Test2 {
    public static void main(String[] args) {
        
        int k = 3;
        double w, x, z;
        int y;
    
        x = 5;
        y = (int)x / k; // 5/3=1  5%3=2
        w = k * x;
        z = Math.pow(x, y); 
        x += y;
    
        System.out.print("\n\n\n");

        System.out.printf("%4.2f\n", x);
        System.out.printf("%d\n", y);
        System.out.printf("%4.2f\n", z);
        System.out.printf("%4.1f\n", w);

        System.out.print("\n\n\n");

    }
}
