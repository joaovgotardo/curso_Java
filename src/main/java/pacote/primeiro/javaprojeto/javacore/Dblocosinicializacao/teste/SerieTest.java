package pacote.primeiro.javaprojeto.javacore.Dblocosinicializacao.teste;

import pacote.primeiro.javaprojeto.javacore.Dblocosinicializacao.dominio.Serie;

public class SerieTest {
    public static void main(String[] args) {
        Serie serie = new Serie();
        Serie serie2 = new Serie();
        for (int temporada : serie.getTemporadas()) {
            System.out.println(temporada);
        }
    }
}
