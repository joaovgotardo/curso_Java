package pacote.primeiro.javaprojeto.introducao;

public class N02TiposPrimitivos {
    public static void main(String[] args) {
        //Tipos primitivos: int, double, float, char, byte, short, long, boolean
        int var1 = 7; //As variáveis devem ser criadas com a primeira letra em minúsculo
        byte var4 = 7; //O número limite para a variável é entre -128 e 127
        short var5 = 7; //Tem dois bytes
        long var6 = 25905060;
        double var2 = 2500.27; //O limite é o dobro do float, para decimais;
        float var3 = 2500.41416F; // É diferenciado do double por um F no final
        boolean var7 = true; //Tem um limite de 1 bit incluindo strings
        char var8 = 'M'; //Se um número for colocado, será traduzido para ASCII

        //O casting pode ser feito forçando um tipo de uma variável a ser de outro
        int numero = (int) 100000000000L;
        System.out.println("São " + var1 + " unidades!");
        System.out.println(numero);

        String nome = "A string aceita textos maiores que o char; ela é uma classe no Java";
        System.out.println(nome);
    }
}
