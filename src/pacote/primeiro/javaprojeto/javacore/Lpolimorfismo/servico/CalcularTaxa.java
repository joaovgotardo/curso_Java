package pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.servico;

import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio.Celular;
import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio.Computador;
import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio.Notebook;
import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio.Produto;


//Modelo MVC - Modelo / Regra de Negócio / Implementação

public class CalcularTaxa {
    public static void CalculaTaxa (Produto produto){

        //Através do polimorfismo, foi criado um único método, e esse é responsável pela
        //da regra de negócio.
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Imposto Devido: " + produto.taxar());
        if(produto instanceof Celular){
            Celular celular = (Celular) produto;
            System.out.println("Nível de Brilho: " + celular.getTaxaBrilho());
        }
        System.out.println("--\"------\"------\"---------");
    }
//    public static void CalculaTaxaComputador(Computador computador){
//        System.out.println("Computador: " + computador.getNome());
//        System.out.println("Preço: R$" +computador.getPreco());
//        System.out.println("Imposto a Pagar: R$" + computador.taxar());
//    }
//    //Não estão sendo alterados os métodos.
//    public static void CalculaTaxaNotebook(Notebook notebook){
//        System.out.println("Notebook: " + notebook.getNome());
//        System.out.println("Preço: R$" + notebook.getPreco());
//        System.out.println("Imposto a Pagar: R$" + notebook.taxar());
//    }
}
