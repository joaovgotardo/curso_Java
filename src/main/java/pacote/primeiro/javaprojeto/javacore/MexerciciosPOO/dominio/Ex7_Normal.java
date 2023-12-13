package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

//crie uma classe Normal, que herda Ingresso e possui um m�todo que imprime: "Ingresso
//Normal".
public class Ex7_Normal extends Ex7_Ingresso{
    public Ex7_Normal (double valor){
        super(valor);
    }
    public void ingressoNormal(){
        System.out.println("Valor do Ingresso Normal: R$" + super.getValor());
    }
}
