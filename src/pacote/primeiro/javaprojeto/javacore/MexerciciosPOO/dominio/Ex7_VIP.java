package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

//crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um método que
//retorne o valor do ingresso VIP (com o adicional inclu�do).

public class Ex7_VIP extends Ex7_Ingresso {
   protected double valor_adicional;
   
   public Ex7_VIP (double valor, double valor_adicional){
      super(valor);
      this.valor_adicional = valor_adicional;
   }
   
   public void imprime_VIP(double valor_Final){
      valor_Final = super.getValor() + valor_adicional; 
      System.out.println("O valor do ingresso VIP é: R$" + valor_Final);
   }
   
   public double getValor_adicional(){
      return valor_adicional;
   }
   
   public void setValor_adicional(double valor_adicional){
      this.valor_adicional = valor_adicional;
   }
}
