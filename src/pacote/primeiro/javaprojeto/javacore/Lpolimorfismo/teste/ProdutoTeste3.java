package pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.teste;

import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio.Celular;
import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio.Computador;
import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio.Notebook;
import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio.Produto;
import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.servico.CalcularTaxa;

//Certas subclasses podem ter atributos não abarcados pela sua superclasse, por exemplo, o
//armazenamento em Celular não pode ser chamado através da instância "Produto.setArmazenamento",
//pois produto não possui esse atributo.
//Contudo, se modificarmos em CalcularTaxa, para fazer o seguinte cast: Celular celular = (Celular) produto,
//uma exceção ocorrerá para outros produtos que não sejam o celular.
//Por causa disso, é usado o instanceof. Esse cast só ocorre em produtos do tipo celular, e não nos outros.
public class ProdutoTeste3 {
    public static void main(String[] args) {
        Produto cm1 = new Computador("HD500GBAMDi5", 4500);
        Celular cl1 = new Celular("SAMSUNGA50", 3000);
        Produto n = new Notebook("LENOVO15\"", 6350);
        cl1.setTaxaBrilho("60%");

        CalcularTaxa.CalculaTaxa(cm1);
        CalcularTaxa.CalculaTaxa(cl1);
        CalcularTaxa.CalculaTaxa(n);

    }
    //Cast também é um tipo de polimorfismo. Por exemplo:
    //int a = (short) 7; ou por exemplo,
    //int x = Integer.parseInt("2"); convertendo uma string em um int.
    //ou o método .toString.
}
