package pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio;
public class Celular extends Produto{
    public Celular (String nome, double preco){
        super(nome, preco);
    }
    public String taxaBrilho;
    public static final double IMPOSTO = 0.22;

    @Override
    public double taxar() {
        return this.preco * IMPOSTO;
    }

    public String getTaxaBrilho() {
        return taxaBrilho;
    }

    public void setTaxaBrilho(String taxaBrilho) {
        this.taxaBrilho = taxaBrilho;
    }
}
