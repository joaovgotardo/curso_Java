package pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio;

/*
* Crie um sistema que gerencie seminários
O sistema deve cadastrar seminários, estudantes, professores e local onde será realizado
Um aluno pode estar em um seminário (1-1);
Um seminário pode ter nenhum ou muitos alunos (1-n);
Um professor pode ministrar vários seminários (1-n);
Um seminário deve ter um local (1-1);

Campos básicos:
Seminário: Título
Aluno: Nome e Idade
Professor: Nome, Especialidade
Local: Endereço
* */
public class ASeminario {
    private String titulo;
    private ALocal local;
    private AAluno[] alunos;

    public void imprimir(){
        System.out.println("Título: " + this.titulo);
        if(local == null) return;
        System.out.println("Local: " + local.getEndereco());
        if(alunos == null) return;
        for (AAluno aluno:alunos) {
            System.out.println("Nomes dos Alunos: " + aluno.getNome());
        }
    }

    public ASeminario(String titulo, ALocal local, AAluno[] alunos){
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ALocal getLocal() {
        return local;
    }

    public void setLocal(ALocal local) {
        this.local = local;
    }

    public AAluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(AAluno[] alunos) {
        this.alunos = alunos;
    }
}
