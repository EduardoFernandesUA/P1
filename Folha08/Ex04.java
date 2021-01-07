import java.util.Scanner;

public class Ex04 {
    public static final Scanner KB = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Operação: ");
        char operacao = KB.nextLine().charAt(0);

        while(operacao != '='){
            if(operacao!='+'&&operacao!='-'&&operacao!='*'&&operacao!='/'){
                System.out.print("Operação nao permitida!\n");
                System.out.print("Operação: ");
                operacao = KB.next().charAt(0);
                continue;
            }

            Complexo a = lerComplexo();
            Complexo b = lerComplexo();
            Complexo c = new Complexo();

            if(operacao=='+'){
                c = sum(a,b);
            }else if(operacao=='-'){
                c = sub(a,b);
            }else if(operacao=='*'){
                c = mult(a,b);
            }else if(operacao=='/'){
                c = div(a,b);
            }

            a.print();
            System.out.print(" "+operacao+" ");
            b.print();
            System.out.print(" = ");
            c.print();
            System.out.println();

            System.out.print("Operação: ");
            operacao = KB.next().charAt(0);
            
        }
    }

    public static Complexo lerComplexo() {
        Complexo input = new Complexo();
        System.out.println("Introduza um número complexo: ");
        System.out.print("Parte real: ");
        input.r = KB.nextDouble();
        System.out.print("Parte imag: ");
        input.i = KB.nextDouble();

        return input;
    }

    public static Complexo sum(Complexo a, Complexo b) {
        Complexo c = new Complexo();
        c.r = a.r+b.r;
        c.i = a.i+b.i;
        return c;
    }

    public static Complexo sub(Complexo a, Complexo b) {
        Complexo c = new Complexo();
        c.r = a.r-b.r;
        c.i = a.i-b.i;
        return c;
    }

    public static Complexo mult(Complexo a, Complexo b) {
        Complexo c = new Complexo();
        c.r = a.r*b.r-a.i*b.i;
        c.i = a.i*b.r+a.r*b.i;
        return c;
    }

    public static Complexo div(Complexo a, Complexo b) {
        Complexo c = new Complexo();
        c.r = (a.r*b.r-a.i*b.i)/(Math.pow(b.r,2)+Math.pow(b.i,2)); 
        c.i = (a.i*b.r+a.r*b.i)/(Math.pow(b.r,2)+Math.pow(b.i,2));
        return c;
    }
}

class Complexo {
    public double r = 0;
    public double i = 0;

    public void print() {
        String signal = i>0 ? "+" : "";
        System.out.printf("%3.1f%s%3.1fi", r, signal, i);
    }
}