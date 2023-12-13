package pacote.primeiro.javaprojeto.exercicios;

/*Criar um vetor de 10 valores e verificar se há valores repetidos */
public class Carrays_Ex3 {
    public static void main(String[] args) {
        int[] array = {2, 4, 2, 6, 5, 8, 3, 11, 2, -4};
        int v_verif = 0;
        int repetido = 0;
        for (int i = 0; i < array.length; i++) {
            if (v_verif == array[i]){
                repetido += 1;
                System.out.println("Existem" + repetido + "elementos repetidos");
            }
            v_verif = array[i];
//            System.out.println("v_Verif: " + v_verif);
//            System.out.println("array[i]: " + array[i]);
        }
    }
}
