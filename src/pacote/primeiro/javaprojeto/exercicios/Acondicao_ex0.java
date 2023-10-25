package pacote.primeiro.javaprojeto.exercicios;
/*
* Escreva um programa que receba o raio de uma circunferência e mostre o diâmetro, comprimento e área desta.
 */

public class Acondicao_ex0 {
    public static void main(String[] args) {
        String unidade = "m";
        double raio = 25;
        double diametro = 2*raio;
        double comprimento = 2*3.141592653*raio;
        double area = (raio*raio)*3.141592653;
        System.out.println("Diâmetro: " + diametro + unidade);
        System.out.println("Comprimento: " + comprimento + unidade);
        System.out.println("Área: " + area + unidade);
    }
}
