package pacote.primeiro.javaprojeto.javacore.Fassociacao.teste;

import pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio.Jogador;
import pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        //Inicialmente os dois objetos ainda serão distintos
        Jogador jogador = new Jogador("Kobe Bryant");
        Time time = new Time("LA Lakers");

        jogador.setTime(time); //A associação surge a partir do set
        //Agora, a impressão deve ser feita depois do time ser setado
        jogador.imprime();
    }
}
