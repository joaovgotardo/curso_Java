package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.dominio;

//Nome da loja:preço:desconto.
public final class Orcamento {
    private final String nome;
    private final Double preco;
    private final Desconto.Perc desconto;

    public Orcamento(String nome, double preco, Desconto.Perc desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public static Orcamento orcamento(String valor){
        //Pode-se fazer um regex para verificações de padrões corretos em uma aplicação real.
        String[] separ = valor.split(":");
        //Cria um novo objeto seguindo o padrão - nome:preco:desconto
        return new Orcamento(separ[0], Double.parseDouble(separ[1].replace(',', '.')),
                Desconto.Perc.valueOf(separ[2]));
    }

    @Override
    public String toString() {
        return "Orcamento{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", desconto=" + desconto +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Desconto.Perc getDesconto() {
        return desconto;
    }
}
