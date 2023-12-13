package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

public class Ex8_Velho extends Ex8_Imovel{
    public final double VALOR_DESCONTO = super.getPreco()*0.07;
    public Ex8_Velho(String endereco, double preco){
        super(endereco, preco);
    }

    public void valor_Velho(){
        super.setPreco(super.getPreco() - VALOR_DESCONTO);
        System.out.println(super.getPreco());
    }
}
