package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.teste;

import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex9_Circulo;
import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex9_Quadrado;
import pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio.Ex9_Retangulo;

////c) Crie uma classe de Teste. No método main crie um vetor de 5 posições que
////contém alguns objetos do tipo AreaCalculavel. Logo após, percorra esse vetor
////imprimindo a área de cada objeto.
public class Ex9_CalculoTeste {
    public static void main(String[] args) {
        Ex9_Circulo c1 = new Ex9_Circulo(20);
        Ex9_Quadrado q1 = new Ex9_Quadrado(12);
        Ex9_Retangulo r1 = new Ex9_Retangulo(10, 5);
        Ex9_Circulo c2 = new Ex9_Circulo(13);
        Ex9_Quadrado q2 = new Ex9_Quadrado(7);
        double[] vetor = {c1.calculaArea(), q1.calculaArea(), r1.calculaArea(), c2.calculaArea(),
                q2.calculaArea()};
        for (double valor:vetor) {
            System.out.println(valor);
        }
    }
}
