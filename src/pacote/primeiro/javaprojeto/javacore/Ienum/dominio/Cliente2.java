package pacote.primeiro.javaprojeto.javacore.Ienum.dominio;

public class Cliente2 {
    //Pode ser criado uma enumeração dentro da classe;

    private String nome;
    //Será criada uma associação da classe com a enumeração;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente2(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente2{" +
                "nome='" + nome + '\'' + ", " +
                "tipoCliente=" + tipoCliente.CODIGO + '\'' + ", " +
                //Quando disso, será impresso também o código do tipo do cliente.
                "tipoPagamento=" + tipoPagamento + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
