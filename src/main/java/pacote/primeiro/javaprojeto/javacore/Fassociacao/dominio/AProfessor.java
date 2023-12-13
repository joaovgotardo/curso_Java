package pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio;

public class AProfessor {
    private String nome;
    private String especialidade;
    private ASeminario[] seminarios;

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (seminarios == null) return;
        for (ASeminario seminario:seminarios) {
            System.out.println("Seminário: " + seminario.getTitulo());
        }
    }

    public AProfessor(String nome, String especialidade, ASeminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ASeminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(ASeminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
