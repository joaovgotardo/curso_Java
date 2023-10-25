package pacote.primeiro.javaprojeto.javacore.Eestaticos.dominio;

public class Serie {
    private String nome;
    private static int[] temporadas;

    static{
        //Um bloco de inicialização estático é útil para otimização, pois será executada apenas uma única vez;
        System.out.println("Bloco estático");
        temporadas = new int[6];
        for (int i = 0; i < temporadas.length; i++) {
            temporadas[i] = i + 1;
        }
    }

    static{
        System.out.println("Bloco estático");
    }

    {
        System.out.println("Bloco não estático");
    }

    public Serie(String nome){
        this.nome = nome;
    }

    public Serie(){
        for(int temporada: Serie.temporadas){
            System.out.print(temporada + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getTemporadas() {
        return temporadas;
    }
}
