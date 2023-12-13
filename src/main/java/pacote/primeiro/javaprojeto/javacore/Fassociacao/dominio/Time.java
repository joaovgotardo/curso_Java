package pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores; //É necessário criar um array para uma associação q envolve muitos

    public Time(String nome){
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprimir(){
        System.out.println(this.nome);
        if (jogadores == null) return;
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome = nome;
    }

}