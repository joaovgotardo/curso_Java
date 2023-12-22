package pacote.primeiro.javaprojeto.javanced.Njunit.servico;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pacote.primeiro.javaprojeto.javanced.Njunit.dominio.Pessoa;

import static org.junit.jupiter.api.Assertions.*;

class PessoaServicoTest {

    //A cobertura da maior quantidade possível de casos é a chave para um bom teste.
    //Testes unitários - Um teste é independente do outro.

    private Pessoa adulto;
    private Pessoa naoAdulto;
    private PessoaServico pessoaServico;

    @BeforeEach //Um método executado antes de cada um dos testes unitários.
    //Todas as vezes que ele for executado, antes dos testes, um novo objeto será criado.
    public void setUp() {
        adulto = new Pessoa(18);
        naoAdulto = new Pessoa(8);
        pessoaServico = new PessoaServico();
    }

    @Test
    //Pode se usar uma notação com o DisplayName para colocar um nome mais organizado.
    @DisplayName("A pessoa não é adulta se tiver menos de 18 anos.")
    void isAdulto_RetornaFalso_IdadeMenor18() {
//        Pessoa pessoa = new Pessoa(17);
//        PessoaServico pessoaServico = new PessoaServico();
        //Assertivas são como opções que aquele código deve prover.
        Assertions.assertFalse(pessoaServico.isAdulto(naoAdulto));
    }

    @Test
    @DisplayName("A pessoa é adulta se tiver 18 ou mais anos.")
    void isAdulto_RetornaTrue_IdadeMaior18() {
        Assertions.assertTrue(pessoaServico.isAdulto(adulto));
    }

    @Test
    @DisplayName("É retornado um NullPointer se o valor da pessoa for nulo.")
    void isAdulto_RetornaException_Null() {
        Assertions.assertThrows(NullPointerException.class, () -> pessoaServico.isAdulto(null));
        //o assert lança uma exceção nullPointer, para cada pessoa que tenha valor nulo.
    }
}
