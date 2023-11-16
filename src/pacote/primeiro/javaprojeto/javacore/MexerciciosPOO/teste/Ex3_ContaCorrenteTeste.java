package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.teste;

import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex3_ContaCorrente;
import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.servico.Ex3_ContaCorrenteServico;

public class Ex3_ContaCorrenteTeste {
    public static void main(String[] args) {
        Ex3_ContaCorrente operacao = new Ex3_ContaCorrente();
        Ex3_ContaCorrenteServico.Operacao(operacao);
    }
}