import java.util.Scanner;

public class Ex04 {
    public static final Scanner KB = new Scanner(System.in);
    public static void main(String[] args) {
        String operacao = " ";
        while(operacao.charAt(0)!='='){
            System.out.print("Operação: ");
            operacao = KB.next();

            if(operacao.charAt(0)=='+'){
                Complexo a = lerComplexo();
                Complexo b = lerComplexo();
                Complexo c = sum(a,b);
                a.print();
                System.out.print(" + ");
                b.print();
                System.out.print(" = ");
                c.print();
                System.out.println();
            }else if(operacao.charAt(0)=='-'){
                Complexo a = lerComplexo();
                Complexo b = lerComplexo();
                Complexo c = sub(a,b);
                a.print();
                System.out.print(" - ");
                b.print();
                System.out.print(" = ");
                c.print();
                System.out.println();
            }else if(operacao.charAt(0)=='*'){
                Complexo a = lerComplexo();
                Complexo b = lerComplexo();
                Complexo c = mult(a,b);
                a.print();
                System.out.print(" * ");
                b.print();
                System.out.print(" = ");
                c.print();
                System.out.println();
            }else if(operacao.charAt(0)=='/'){
                Complexo a = lerComplexo();
                Complexo b = lerComplexo();
                Complexo c = div(a,b);
                a.print();
                System.out.print(" / ");
                b.print();
                System.out.print(" = ");
                c.print();
                System.out.println();
            }else{
                System.out.println("Operação não permitida!");
            }
        }
    }  

    public static Complexo lerComplexo() {
        System.out.println("Introduza um número complexo: ");
        System.out.print("Parte real: ");
        double r = KB.nextDouble();
        System.out.print("Parte imag: ");
        double i = KB.nextDouble();

        Complexo input = new Complexo();
        input.set(r,i);
        return input;
    }

    public static Complexo sum(Complexo a, Complexo b) {
        Complexo c = new Complexo();
        c.set( a.r+b.r , a.i+b.i );
        return c;
    }

    public static Complexo sub(Complexo a, Complexo b) {
        Complexo c = new Complexo();
        c.set( a.r-b.r , a.i-b.i );
        return c;
    }

    public static Complexo mult(Complexo a, Complexo b) {
        Complexo c = new Complexo();
        c.set( a.r*b.r-a.i*b.i , a.i*b.r+a.r*b.i );
        return c;
    }

    public static Complexo div(Complexo a, Complexo b) {
        Complexo c = new Complexo();
        c.set( (a.r*b.r-a.i*b.i)/(Math.pow(b.r,2)+Math.pow(b.i,2)) , (a.i*b.r+a.r*b.i)/(Math.pow(b.r,2)+Math.pow(b.i,2)) );
        return c;
    }
}


class Complexo {
    public double r = 0;
    public double i = 0;

    public void set(double _r, double _i) {
        r = _r;
        i = _i;
    }

    public void print() {
        char signal = i>0 ? '+' : '-';
        System.out.printf("%3.1f%c%3.1fi", r, signal, i);
    }
}