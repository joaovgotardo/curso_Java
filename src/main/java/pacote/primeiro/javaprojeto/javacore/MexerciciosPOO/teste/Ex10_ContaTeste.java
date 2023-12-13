package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.teste;

import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex10_ContaCorrente;
import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex10_ContaPoupanca;
import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex10_SeguroVida;

public class Ex10_ContaTeste {
    public static void main(String[] args) {
        Ex10_ContaPoupanca cp1 = new Ex10_ContaPoupanca(2500, 15419);
        Ex10_ContaCorrente cc1 = new Ex10_ContaCorrente(4000, 24091);
        Ex10_SeguroVida sv1 = new Ex10_SeguroVida(2000, 10414);
        cp1.setSaque(1500); cp1.sacar(); cp1.obterSaldo();
        cc1.setDeposito(2000); cc1.depositar(); cc1.obterSaldo();
        sv1.setSaque(1750); sv1.sacar(); sv1.obterSaldo();
    }
}
