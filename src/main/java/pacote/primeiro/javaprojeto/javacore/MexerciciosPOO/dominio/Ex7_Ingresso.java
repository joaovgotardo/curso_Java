/*
Crie uma classe chamada Ingresso que possui um valor em reais e um
m�todo imprimeValor().
a. crie uma classe VIP, que herda Ingresso e possui um valor adicional. Crie um m�todo que
retorne o valor do ingresso VIP (com o adicional inclu�do).
b. crie uma classe Normal, que herda Ingresso e possui um m�todo que imprime: "Ingresso
Normal".
c. crie uma classe CamaroteInferior (que possui a localização do ingresso e métodos para
acessar e imprimir esta localização) e uma classe CamaroteSuperior, que é mais cara (possui
valor adicional). Esta última possui um método para retornar o valor do ingresso. Ambas as
classes herdam a classe VIP*/

package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

public class Ex7_Ingresso {
   protected double valor;
   
   public Ex7_Ingresso(double valor){
      this.valor = valor;
   }
   
   public void imprimeValor(){
      System.out.println("Valor: R$" + valor);
   }
   
   public double getValor(){
      return valor;
   }
   
   public void setValor(double valor){
      this.valor = valor; 
   }
}
