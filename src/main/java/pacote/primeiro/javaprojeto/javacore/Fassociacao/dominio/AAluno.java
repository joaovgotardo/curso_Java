package pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio;

public class AAluno {
    private String nome;
    private int idade;
    private ASeminario seminario;

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (seminario == null) return;
        else {
            System.out.println("Seminário: " + seminario.getTitulo());
        }
    }

    public AAluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ASeminario getSeminario() {
        return seminario;
    }

    public void setSeminario(ASeminario seminario) {
        this.seminario = seminario;
    }
}
