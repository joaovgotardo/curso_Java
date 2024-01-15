package pacote.primeiro.javaprojeto.exercicios;

public @interface ResumoPOO {
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
     O this não é usado em estáticos.

     Associação: É literalmente a associação entre as classes. Pode ser feito um paralelo com os bancos de dados,
     da seguinte maneira:
     UNIDERECIONAL: Jogador 1 -- 1 Personagem  1/1
     UNIDIRECIONAL UM-MUITOS: Pessoa 1 -- N Amigos  1/N
     UNIDIRECIONAL MUITOS-UM: Amigos N -- 1 Pessoa  N/1
     * BIDIRECIONAL: Aluno N -- N Curso
     Em uma associação de muitos, são usados arrays.

     Leitura de dados do console: É usado através do java.util.scanner. A sintaxe é a seguinte:
     Scanner variavel = new Scanner (System.in);
     Sout (Comando:);
     String nome = variavel.nextLine();
     Em que a próxima linha será o valor que nome assume.

     Herança: É a extensão das funcionalidades de uma classe. Se um construtor for usado dentro da superclasse,
     isto é, da classe que é herdada, outro deve ser escrito dentro da subclasse.
     Ao invés do public ou private, o protected é mais usado. Com isso, as subclasses podem usar os atributos
     de sua superclasse.

     toString: O método toString é uma subclasse de String. Pode ser criado um para imprimir valores de instâncias.
     Se for chamado, por exemplo sout(instância), com o toString feito dentro da classe, irá retornar o valor da instância.
     Se ele não for sobrescrito, ele retorna a posição da memória.

     Modificador Final: É usado para constantes. A constante é digitada em UPPERCASE. Em um método, ele jamais
     poderá ser sobrescrito.
     Ex: public final Referencia REFERENCIA = new Referencia();
     Isso significa que a referência só poderá ser feita nessa instância;
     Ela em si pode receber outros valores, porém, final Referencia indica que referenciará somente um objeto.
    Classes com o modificador final não podem ser sobrescritas.

     Enumerador: A enumeração é um tipo especial de classe, em que os atributos são constantes, e tipos não
     são usados para declará-los. Métodos podem ser usados na enumeração, geralmente finals, mas não estáticos.
     A enumeração também pode ser usada para sobrescrita de métodos.

     Classes Abstratas: As classes abstratas servem como templates, isto é, elas próprias não existem sozinhas,
     mas servem como um modelo das suas subclasses; por exemplo, todas elas podem ser funcionários, mas nenhuma
     é isso unicamente, logo, cada uma tem uma função específica que é explicitada na subclasse.
     Métodos abstratos são usados para obrigar que a subclasse determine um comportamento específico, de forma
     obrigatória, tanto na própria classe quanto em eventuais subclasses.

     Interfaces: Semelhante às classes abstratas, ela determina um contrato, que deve ser seguido por
     classes que o implementarem, que vai definir seu comportamento. Por padrão, um método da interface
     é public abstract. As classes podem implementar várias interfaces ao mesmo tempo.

     Polimorfismo: Usado para referenciar subclasses a partir de suas classes a partir de sua classe-pai.
     Métodos ou atributos específicos da subclasse não podem ser acessados através desse mecanismo.
     */
}
