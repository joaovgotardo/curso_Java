package pacote.primeiro.javaprojeto.introducao;

public class N05RepeticaoExercicio {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1000000
        for(int i = 0; i <= 1000000; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
        //Dado o valor de um carro, descubra em quantas parcelas ele pode ser pago
        //Com parcela == 1000;
        int valor = 68196;
        int cont = 0;
        int pqbr = 0;
        for(int i = 0; i <= valor; i++){
            if(i%1000 == 0){
                cont+=1;
            }else if(valor-i < valor%1000) {
                pqbr += 1;
            }
        }
        System.out.println("O carro com preço de R$"+valor+" pode ser pago em "+
                (cont-1)+" parcelas de R$1000 e uma parcela de R$"+pqbr);
    }
}
