package pacote.primeiro.javaprojeto.javacore.Gheranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private String data_nasc;
    private Endereco endereco;

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.data_nasc);
        System.out.println(endereco.getBairro() +"," + endereco.getCidade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
