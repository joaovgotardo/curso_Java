package pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio;

public class Notebook extends Produto{
    public static final double IMPOSTO = 0.2;
    public Notebook(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double taxar(){
        return this.preco*IMPOSTO;
    }
}
