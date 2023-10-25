package pacote.primeiro.javaprojeto.exercicios;

public @interface ResumoMetodos {
    /**
     Uma classe é representada por
     public class {}, onde dentro estarão os atributos, as características da classe, que são
     representadas por public [tipo de variável], ou seja, String, int, double, etc.
     Outra classe deve referenciar esta, para que ela seja inicializada, através do:
     Classe [nome da variável] = new Classe ();
     Onde poderão ser dados valores aos seus atributos;

     Um método é usado para determinar uma ação da classe. Ele pode ser feito com o public void(),
     onde dentro dos parênteses, são recebidos os parâmetros. A partir da classe teste, os parâmetros
     podem receber valores. Os métodos podem agir por todas as classes; cada instância dela pode ser chamada
     por instancia.metodo (parametro1, parametro2);

     Atributos privados são atributos que não podem ser acessados por eventuais instâncias, mas apenas pelas classes.
     Esse atributo é útil para aspectos de segurança.

     Os métodos getters são usados para pegar atributos retorna o atributo. O this pode referenciar o próprio atributo.
     Os métodos setters são usados para relacionar atributos privados com métodos.

     Os construtores são úteis para que os atributos sejam usados de forma obrigatória, exemplo:
         public Musica(String nome, String artista, String genero, int ano, String album){
         this.nome = nome;
         this.artista = artista;
         this.genero = genero;
         this.ano = ano;
         this.album = album;
         }
     Numa eventual instância, o método pode ser chamado da seguinte maneira:
     Musica musica = new Musica("New Dawn Fades", "Joy Division",
     "Post-Punk", 1979, "Unknown Pleasures", "Factory Records");
     em que cada parte é um parâmetro usado no construtor.

     Para uma variável array privada, é usado o bloco de inicialização. Exemplo:
     private int[] temporadas;

     {
     Bloco de inicialização é recomendado quando for lançada uma exceção ou inicializar uma variável
     temporadas = new int[27];
     for (int i = 0; i < temporadas.length; i++) {
     temporadas[i] = i + 1;
     }
     }

     Modificador static: Este é usado para fazer com que o atributo seja diretamente relacionado à classe;
     em quaisquer instâncias, ele terá sempre o mesmo valor atribuído ou inicial.

     *
     *
     *
     *
     **/
}
