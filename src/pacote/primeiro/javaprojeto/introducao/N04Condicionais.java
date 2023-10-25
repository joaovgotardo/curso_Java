package pacote.primeiro.javaprojeto.introducao;

public class N04Condicionais {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        int idade = 22;
        //idade < 15 = categoria infantil;
        //idade >=15 && idade < 18 = categoria juvenil;
        // idade > 18 = categoria adulta;
        if (a + b > 2 * a) {
            System.out.println("A soma de a e b é maior que o dobro de a");
        } else if (a - b != 0) {
            System.out.println("A subtração de a e b é diferente de 0");
        } else {
            System.out.println("Nada");
        }
        if (idade < 15) {
            System.out.println("Categoria de Jooj é infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria de Jooj é juvenil");
        } else if (idade > 18) {
            System.out.println("Categoria de Jooj é adulta");
        } else {
            System.out.println("Idade inválida");
        }
        //Operador ternário
        double salario = 2999.99;
        String comprar = "Eu posso comprar o produto de 3000.00";
        String naocomprar = "Eu não posso comprar ainda";
        //sintaxe do op. ternário: condicao ? verdadeiro : falso
        System.out.println(salario > 3000.00 ? comprar : naocomprar);

        //Switch Case
        byte dia = 15;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");

        }
    }
}
