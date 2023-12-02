package pacote.primeiro.javaprojeto.javanced.Goptional.teste;

import pacote.primeiro.javaprojeto.javanced.Goptional.dominio.Musica;
import pacote.primeiro.javaprojeto.javanced.Goptional.repositorio.RepositorioMusica;

import java.util.Optional;

public class OptionalMusicaTeste {
    public static void main(String[] args) {
        //Teste do nome.
        Optional<Musica> musicaOptional = RepositorioMusica.filtroNome("Day Is Done");
        musicaOptional.ifPresent(musica -> musica.setNome("Pink Moon"));
        System.out.println(musicaOptional);

        //Esse testará o ID.
        Musica musica = new RepositorioMusica().filtroId(4).orElseThrow(
                IndexOutOfBoundsException::new);
        System.out.println(musica);

        //Testa se a música existe, se não, cria uma nova.
        Musica newDawnFades = RepositorioMusica.filtroNome("New Dawn Fades")
                .orElseGet(() -> new Musica(3, "New Dawn Fades", "Joy Division", 270));
    }
}
