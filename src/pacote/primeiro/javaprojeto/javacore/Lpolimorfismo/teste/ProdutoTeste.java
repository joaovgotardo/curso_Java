package pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.teste;

import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio.Celular;
import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio.Computador;
import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio.Notebook;
import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.servico.CalcularTaxa;

public class ProdutoTeste {
    public static void main(String[] args) {
        Computador computador = new Computador("SK1i5", 7000);
        Notebook notebook = new Notebook("ASUSi7", 6500);
        Celular celular = new Celular("SAMSUNG-A10", 2000);
        CalcularTaxa.CalculaTaxa(computador);
        CalcularTaxa.CalculaTaxa(notebook);
        CalcularTaxa.CalculaTaxa(celular);
    }
}
