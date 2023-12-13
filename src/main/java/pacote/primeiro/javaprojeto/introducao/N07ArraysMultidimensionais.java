package pacote.primeiro.javaprojeto.introducao;

public class N07ArraysMultidimensionais {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5 Meses
        // 31, 28, 31, 30, 31 Dias
        int[][] dias = new int[2][2]; //os arrays funcionam como as matrizes da matemática
        dias[0][0] = 7;
        dias[0][1] = -4;
        for (int i = 0; i <= dias.length; i++) { //É necessário fazer um for para cada vetor
            for (int j = 0; j <= dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        //Com o foreach
        for (int[] arr : dias) {
            for (int i : arr) { //Uma variável de referência
                System.out.println(i);
            }
        }

        //Outra forma de inicializar os arrays:
        int[][] array = {{1, 5, 7}, {41, -9, 27, 4}, {0, -2, 1, 9, 4, 6}}; //referencia três arrays de inteiros

        for (int[] array2 : array) {
            System.out.println("\n");
            for (int n : array2) {
                System.out.print(n + " | ");
            }
        }
    }
}
