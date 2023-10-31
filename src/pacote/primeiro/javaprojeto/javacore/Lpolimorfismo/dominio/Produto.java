package pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio;

public abstract class Produto implements Taxar {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    //1 - Foi criada uma classe abstrata, pois o que deve ter procedência são as classes concretas, não o produto em si;
    //2 - Foram criadas as classes concretas;
    //3 - Foi criada a interface para cálculo da taxa;
    //4 - Foi implementado o método da interface nas subclasses não abstratas;

    //5 - Foi criada a classe para implementar a regra de negócio (calcular o imposto), em uma área separada

    //6 - Foram feitos os instanciamentos da classe da regra de negócio.

    //https://pt.wikipedia.org/wiki/MVC
}
