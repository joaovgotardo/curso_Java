package pacote.primeiro.javaprojeto.javacore.Gheranca.dominio;

//O object é a classe-pai de todas as classes no Java - todas são um objeto, e por isso, todas são sub-classes
//Isso acaba por ficar subentendido, então não é preciso estender o Object manualmente

public class Pessoa{
    //Através do protected, todas as subclasses de uma classe-pai podem acessar seus atributos
    //como se eles fossem públicos; isso também pode ser feito em quaisquer classes dentro do mesmo pacote.
    protected String nome;
    protected String cpf;
    protected String data_nasc;
    protected Endereco endereco;
    static{
        System.out.println("Dentro do bloco estático Pessoa");
    }
    {
        System.out.println("Dentro do bloco não estático Pessoa");
    }

    public Pessoa(String nome){
        this.nome = nome;
    }

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
