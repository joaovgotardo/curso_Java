/*Coesão - Indica que as partes de um mesmo código estão ligadas com um objetivo em comum.
Determina na prática, que os módulos façam poucas atividades.
*
Acoplamento - Indica o quanto um módulo está ligado ao outro. Quando há baixo acoplamento, a
função ficará mais organizada. Quando ocorre uma mudança em um código de alto acoplamento, fica
necessário fazer mudanças em vários outros, o que pode ocasionar erros.
Conteúdo - Quando um módulo pode acessar, modificar ou se referenciar diretamente a conteúdos de outro módulo.
Global - Quando os módulos podem ler e escrever dados globais de um módulo.
Controle - Quando um modulo irá decidir como outro funcionará.
Estrutura de dados - Quando os dados de um módulo são passados em uma estrutura de dados passada como parâmetro.
Dados - Quando apenas os dados realmente necessários para outro módulo são passados como parâmetros
*/
package pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome; //private significa que os atributos só poderão ser acessados pelo objeto;
    private int idade;
    public void imprime(){
        System.out.println("Idade: "+ idade);
        System.out.println("Nome: "+ nome);
    }
    public void setNome(String nome){ //o set é usado para relacionar atributos privados com métodos externos
        this.nome = nome; //É necessário usar o this para que o valor possa ser modificado, se parâmetro = atributo
    }
    public void setIdade(int idade){
        if(idade <= 0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){ //Não usa o void pois precisa do return; get é usado para devolver um valor;
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
}
