package pacote.primeiro.javaprojeto.javacore.Ienum.dominio;

//A enumeração é um tipo especial de classe, em que todos os atributos são clientes;
//Tipos não são usados; todos os atributos são do tipo "TipoCliente", que é a enumeração.
public enum TipoCliente {
    P_FISICA(1),
    P_JURIDICA(2);

    //Pode ser criado um construtor para uma enumeração, que poderá receber atributos.
    //Variáveis não podem vir antes da enumeração. 
    private int codigo;
    TipoCliente(int codigo) {
    }
}
