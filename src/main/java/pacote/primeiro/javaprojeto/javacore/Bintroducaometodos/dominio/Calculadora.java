package pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    //Exemplo de um método: o identificador void significa que ele não precisa retornar nada
    public int a;
    public int b;
    public void soma(){
        System.out.println(a+b);
    };
    public void subtracao(){
        if(a > b){
            System.out.println(a-b);
        }else{
            System.out.println(b-a);
        }
    }

    public void multiplica(int n1, int n2){
        System.out.println(n1*n2);
    }

    public int divisao(int dv1, int dv2){
        if(dv1>dv2){
            return dv1/dv2;
        }else if (dv2 == 0 || dv1 == 0){
            System.out.println("Não existe divisão por zero");
            return 0;
        }return dv2/dv1;
    }

    public void alteranum(int n1, int n2){
        //Dois valores passados em primitivos não serão alterados
        n1 = 75;
        n2 = 25;
        System.out.println("N1: " + n1);
        System.out.println("N2: " + n2);
    }

    public void somarray(int[] a1){
        int cont = 0;
        for (int i : a1) {
            cont += i;
        }
        System.out.println(cont);
    }

    public void somaVarArgs(int... n){ //uma sintaxe para transformar variáveis em arrays
        // o varargs precisa ser o último, ou o único
        int cont = 0;
        for (int i : n) {
            cont += i;
        }
        System.out.println(cont);
    }
}
