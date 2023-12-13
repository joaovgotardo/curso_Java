package pacote.primeiro.javaprojeto.javacore.Fassociacao.teste;

import pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio.Jogador;
import pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio.Time;

public class JogadorTest3 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Calleri");
        Time time = new Time ("São Paulo");
        Jogador[] jogadores = {jogador};
        jogador.setTime(time);
        time.setJogadores(jogadores);
        jogador.imprime(); time.imprimir();
    }
}
