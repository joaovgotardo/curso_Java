package pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio;

public class Jogador {

    //Uma associação é o relacionamento entre dois objetos;
    /*
    * Jogador 1 -- 1 Personagem  1/1
    * UNIDIRECIONAL UM-MUITOS: Pessoa 1 -- N Amigos  1/N
    * UNIDIRECIONAL MUITOS-UM: Amigos N -- 1 Pessoa  N/1
    * BIDIRECIONAL: Aluno N -- N Curso */
    private String nome;
    private Time time; //Isso significa uma associação;

    public void imprime(){
        System.out.println("Jogador: " + this.nome);
        if (time == null){
            System.out.println("Sem time");
        }else{
            System.out.println("Time: " + time.getNome());
        }
    }

    public Jogador(String nome){
        this.nome = nome;
    }

    public Time getTime(){
        return time;
    }

    public void setTime(Time time){
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
