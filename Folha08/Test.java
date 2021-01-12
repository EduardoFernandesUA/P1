import java.util.Scanner;

public class Test {
    public static final Scanner KB = new Scanner(System.in);

    public static void main(String[] args) {
        Ponto origem = new Ponto();
        origem.x = 0;
        origem.y = 0;

        double soma = 0;
        int counter = 0;
        Ponto p = new Ponto();
        Ponto maisAfastado = new Ponto();
        do{
            p = ler();
            double dist = distPontos(p, origem);
            soma += dist;
            if( distPontos(maisAfastado,origem) < dist ) {
                maisAfastado.x = p.x;
                maisAfastado.y = p.y;
            }
            counter++;
        }while( !(p.x==0&&p.y==0) );
        
        System.out.printf("A soma das distâncias dos %d pontos à origem é %.1f\n", counter, soma);
        System.out.printf("O ponto mais afastado da origem foi: %s\n", escrever(maisAfastado));
    }

    public static Ponto ler() {
        System.out.println("Introduza um ponto:");
        Ponto p = new Ponto();
        System.out.print("Coordenada X: ");
        p.x = KB.nextInt();
        System.out.print("Coordenada Y: ");
        p.y = KB.nextInt();
        return p;
    }

    public static String escrever(Ponto p) {
        return String.format("(%.1f, %.1f)", p.x, p.y);
    }

    public static double distPontos(Ponto a, Ponto b) {
        return Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2));
    }

}

class Ponto {
    double x = 0;
    double y = 0;
}