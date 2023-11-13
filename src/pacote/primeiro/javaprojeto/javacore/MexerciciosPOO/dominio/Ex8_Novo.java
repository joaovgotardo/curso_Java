package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

public class Ex8_Novo extends Ex8_Imovel{
    public final double VALOR_ADICIONAL = super.getPreco()*0.1;
    public Ex8_Novo(String endereco, double preco){
        super(endereco, preco);
    }
    public void valor_Novo(){
        super.setPreco(super.getPreco() + VALOR_ADICIONAL);
        System.out.println(super.getPreco());
    }
}
