public class Test {
    public static void main(String[] args) {
        Pessoa a = new Pessoa();
        a.nome = "ana";
        a.idade = 33;
        q(a);
        System.out.printf("%s %d%n",a.nome,a.idade);
    }

    public static void q(Pessoa t){
        t.idade = 22;
    }
}

class Pessoa {
    String nome;
    int idade;
}
