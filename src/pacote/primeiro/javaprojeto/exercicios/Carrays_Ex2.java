package pacote.primeiro.javaprojeto.exercicios;

/* Percorrer todos os elementos de um array, exibir a soma dos valores positivos e a quantidade de
valores negativos*/
public class Carrays_Ex2 {
    public static void main(String[] args) {
        int[] array = {1, -2, 4, 7, -6, 3, -5, 2, 8, 0};
        int soma = 0;
        int negat = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                soma += i;
            }else if (array[i] < 0){
                negat += 1;
            }else if (array[i] == 0){
                continue;
            }
        }
        System.out.println("Soma dos Positivos: " + soma);
        System.out.println("Quantidade de Negativos: " + negat);
    }
}
