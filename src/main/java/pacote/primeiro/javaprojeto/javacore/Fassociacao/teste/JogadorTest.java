package pacote.primeiro.javaprojeto.javacore.Fassociacao.teste;

import pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Messi");
        Jogador j2 = new Jogador("Cerrissete");
        Jogador j3 = new Jogador("Mbappé");
        Jogador[] jogadores = new Jogador[]{j1, j2, j3};

        //A partir desse conceito, cada jogador terá duas referências em memória; uma de sua posição no array,
        //e a outra da própria instância.

        for (Jogador jogador: jogadores) { //foreach é usado para LISTASSS
            jogador.imprime();
        }
    }
}
