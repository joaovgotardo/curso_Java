package pacote.primeiro.javaprojeto.javacore.Ienum.teste;

import pacote.primeiro.javaprojeto.javacore.Ienum.dominio.Cliente1;
import pacote.primeiro.javaprojeto.javacore.Ienum.dominio.Cliente2;
import pacote.primeiro.javaprojeto.javacore.Ienum.dominio.TipoCliente;
import pacote.primeiro.javaprojeto.javacore.Ienum.dominio.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        //Embora as instâncias abaixo impeçam de alguma forma que qualquer valor seja adicionado,
        //Ele ainda pode ser, como no caso de cliente3
//        Cliente1 cliente1 = new Cliente1("Vanderlei", "P_FISICA");
//        Cliente1 cliente2 = new Cliente1("Alejandro", "P_FISICA");
//        Cliente1 cliente3 = new Cliente1("Serenata", "COISA");
//        Cliente1 cliente4 = new Cliente1("André Motorizações", "P_JURIDICA");

        Cliente2 cliente1 = new Cliente2("Vanderlei", TipoCliente.P_FISICA, TipoPagamento.PIX);
        Cliente2 cliente4 = new Cliente2("André Motorizações", TipoCliente.P_JURIDICA, TipoPagamento.DEBITO);
        Cliente2 cliente2 = new Cliente2("Alejandro", TipoCliente.P_FISICA, TipoPagamento.CREDITO);
//        Cliente2 cliente3 = new Cliente2("Serenata", null);
        //Agora cliente3 é uma exceção (ainda não abordado);
        System.out.println(cliente1);
        System.out.println(cliente2);
//        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(TipoPagamento.DEBITO.Desconto(500));
        System.out.println(TipoPagamento.CREDITO.Desconto(500));
        System.out.println(TipoPagamento.PIX.Desconto(500));
    }
}
