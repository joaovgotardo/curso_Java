package pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.servico;

import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio.Computador;
import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio.Notebook;


//Modelo MVC - Modelo / Regra de Negócio / Implementação

public class CalcularTaxa {
    public static void CalculaTaxaComputador(Computador computador){
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Preço: R$" +computador.getPreco());
        System.out.println("Imposto a Pagar: R$" + computador.taxar());
    }
    //Não estão sendo alterados os métodos.
    public static void CalculaTaxaNotebook(Notebook notebook){
        System.out.println("Notebook: " + notebook.getNome());
        System.out.println("Preço: R$" + notebook.getPreco());
        System.out.println("Imposto a Pagar: R$" + notebook.taxar());
    }
}
