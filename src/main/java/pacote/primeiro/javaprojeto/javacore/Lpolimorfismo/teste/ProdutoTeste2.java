package pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.teste;

import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio.Computador;
import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.dominio.Produto;
import pacote.primeiro.javaprojeto.javacore.Lpolimorfismo.servico.CalcularTaxa;

//"O Polimorfismo é um mecanismo por meio do qual selecionamos as funcionalidades utilizadas de
// forma dinâmica por um programa no decorrer de sua execução. Com o Polimorfismo, os mesmos atributos
// e objetos podem ser utilizados em objetos distintos, porém, com implementações lógicas diferentes."
public class ProdutoTeste2 {
    public static void main(String[] args) {
        //Através do polimorfismo, pode-se instanciar uma subclasse a partir de sua classe-pai.
        //Uma subclasse que contém um atributo diferente de sua superclasse não poderá ser instanciada
        //através da superclasse.
        Produto c1 = new Computador("HD500GBAMDi5", 4500);
        System.out.println(c1.getNome());
        System.out.println(c1.getPreco());
        System.out.println(c1.taxar());
    }
}
