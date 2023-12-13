package pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO = 0.25;
    public Computador(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public double taxar(){
        return this.preco*IMPOSTO;
    }
}
