public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Mateus", 22);

        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());

        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();

        //System.out.println(p1.getIdade());
        System.out.println(p1.toString());
    }
}