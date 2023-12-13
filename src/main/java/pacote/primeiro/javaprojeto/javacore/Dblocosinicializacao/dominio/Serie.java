package pacote.primeiro.javaprojeto.javacore.Dblocosinicializacao.dominio;

public class Serie {
    private String nome;
    private int[] temporadas;

    {
        //Bloco de inicialização é recomendado quando for lançada uma exceção ou inicializar uma variável
        temporadas = new int[27];
        for (int i = 0; i < temporadas.length; i++) {
            temporadas[i] = i + 1;
        }
    }

    public Serie(String nome){
        this.nome = nome;
    }

    public Serie(){
        for(int temporada : this.temporadas){
            System.out.println(temporada);
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getTemporadas() {
        return temporadas;
    }
}
