package pacote.primeiro.javaprojeto.javacore.Cconstrutores.teste;

import pacote.primeiro.javaprojeto.javacore.Cconstrutores.dominio.Musica;

public class MusicaTeste {
    public static void main(String[] args) {
        Musica musica = new Musica("New Dawn Fades", "Joy Division",
                "Post-Punk", 1979, "Unknown Pleasures", "Factory Records");
        musica.imprime();
        //se nenhum nome for dado, será usado o padrão dado ao criar a música.
//
//        musica.init("Sextape", "Deftones", "Alternative", 2010);
//        musica.init("New Dawn Fades", "Joy Division",
//                "Post-Punk", 1979, "Unknown Pleasures");
//        musica.setNome("New Dawn Fades");
//        musica.setArtista("Joy Division");
//        musica.setGenero("Post-Punk");
//        musica.setAno(1979);

    }
}
