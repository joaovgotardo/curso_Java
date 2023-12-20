package pacote.primeiro.javaprojeto.javanced.Mcrud.dominio;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Diretor {
    Integer id;
    String nome;
}
