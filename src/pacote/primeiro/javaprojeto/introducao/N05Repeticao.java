package pacote.primeiro.javaprojeto.introducao;

public class N05Repeticao {
    public static void main(String[] args) {
        int count = 0;
        while (count != 10) {
            System.out.println(++count);
        }
        // do while difere por, independente se a condição for falsa ou não, sempre executará uma vez;
        do {
            System.out.println("Do-While");
        } while (count > 11);

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println(j);
            }
        }
        //break - Imprima de 0 até 25 em um for de 50 números:
        for (int i = 0; i <=50 ; i++) {
            System.out.println(i);
            if (i == 25){
                break;
            }
        }
        //continue
        int j = 1;
        int cont = 0;
        int total = 0;
        for (int i = 25000; i >= -16100; i--) {
            int asdasd = i/j++;
            if(asdasd%10 == 7){
                cont += 1; total += 1;
                if(cont >= 7){
                    System.out.println("Achou que ia ser a 7ª vez? ACHOU ERRADO");
                    cont -= 7;
                    continue;
                }
                System.out.println("Essa é a" + cont + "ª vez que o resto dá 7.");
            }
        }
        System.out.println("O resto deu 7 por " + total + " vezes mas nenhuma foi a 7ª vez!");
    }
}
