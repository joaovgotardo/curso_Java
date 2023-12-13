package pacote.primeiro.javaprojeto.javanced.Goptional.repositorio;

import pacote.primeiro.javaprojeto.javanced.Goptional.dominio.Musica;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class RepositorioMusica {
    static List<Musica> musicas = List.of(
        new Musica(1, "Day Is Done", "Nick Drake", 141),
        new Musica(2, "Dogs", "Pink Floyd", 17*60));

    private static Optional<Musica> filtroMusicas(Predicate<Musica> predicate){
        Musica filtro = null;
        for (Musica musica:musicas) {
            if(predicate.test(musica)){
                filtro = musica;
            }
        }
        return Optional.ofNullable(filtro);
    }

    public static Optional<Musica> filtroNome(String nome){
        return filtroMusicas(musica -> musica.getNome().equals(nome));
    }

    public Optional<Musica> filtroId(Integer id){
        return filtroMusicas(musica -> musica.getId().equals(id));
    }
}
