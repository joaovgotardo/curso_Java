package pacote.primeiro.javaprojeto.exercicios;
/*Escrever um algoritmo que gera e escreve os números ímpares entre 100 e 200. */
public class Brepeticao_Ex6 {
    public static void main(String[] args) {
        for (int i = 100; i < 201; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
