package pacote.primeiro.javaprojeto.javanced.Mcrud.dominio;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Filme {
    Integer id;
    String nome;
    String duracao;
    Diretor id_diretor;
}
