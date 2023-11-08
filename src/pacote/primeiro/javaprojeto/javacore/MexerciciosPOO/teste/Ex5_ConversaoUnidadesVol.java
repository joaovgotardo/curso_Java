package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.teste;
//5 - O volume de uma piscina olímpica é de 1.890 metros cúbicos. Usando a classe
//ConversaoDeUnidadesDeVolume (exercício 5), escreva um programa em Java que mostre qual
//é o volume de uma piscina olímpica em litros, pés cúbicos e centímetros cúbicos. Escreva
//métodos adicionais para a classe ConversaoDeUnidadesDeVolume, se necessário.

public class Ex5_ConversaoUnidadesVol {
    public static void main(String[] args) {
        double vp_olimpica = 1890;
        double litros = vp_olimpica*1000;
        double cm_cubicos = litros*1000;
        double pes_cubicos = vp_olimpica*35.32;
        System.out.println("Volume em m³: " + vp_olimpica);
        System.out.println("Volume em l: " + litros);
        System.out.println("Volume em cm³: " + cm_cubicos);
        System.out.println("Volume em f³: " + pes_cubicos);
    }
}
