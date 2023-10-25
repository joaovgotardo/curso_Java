package pacote.primeiro.javaprojeto.introducao;

/*Dada a seguinte tabela de impostos:
De 0 a 34.712 | 9.70
De 34.713 a 65.807 | 37.35
Maior que 65.808 | 49.5
* */
public class N04CondicionaisExercicio {
    public static void main(String[] args) {
        double sal_anual = -2567;
        if (sal_anual >= 0 && sal_anual <= 34712) {
            System.out.println("Você deverá pagar 9.7% do seu salário, que são $" + sal_anual * 0.097);
        } else if (sal_anual >= 34713 && sal_anual <= 65807) {
            System.out.println("Você deverá pagar 37.35% do seu salário, que são $" + sal_anual * 0.3735);
        } else if (sal_anual >= 65808) {
            System.out.println("Você deverá pagar 49.5% do seu salário, que são $" + sal_anual * 0.495);
        } else {
            System.out.println("Valor inválido");
        }
        //Dados os valores de 1 a 7 imprima se é dia útil ou final de semana:
        byte dia = 6;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
