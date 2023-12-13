package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.teste;

import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex8_Novo;
import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex8_Velho;

public class Ex8_ImovelTeste {
    public static void main(String[] args) {
        Ex8_Novo im1 = new Ex8_Novo("Rua 1, Cidade", 500000);
        Ex8_Velho im2 = new Ex8_Velho("Rua 15, Cidade", 450000);

        im1.valor_Novo();
        im2.valor_Velho();
    }
}
