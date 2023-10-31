package pacote.primeiro.javaprojeto.javacore.Jclassesabstratas.dominio;

//No mundo real, não existem funcionários em si, mas apenas cargos que eles ocupam.
//Embora todos sejam funcionários, cada um tem um cargo específico, e este não pode ser nulo.
//As classes abstratas servem para corrigir esse problema na POO.

//Isso significa que a classe abstrata foi feita para ser uma superclasse.
public abstract class Funcionario extends Pessoa{
    //Isso gera um problema: As subclasses de Funcionario agora serão obrigadas a implementar os métodos
    //abstratos de sua classe-avô. Contudo, se esta for implementada dentro da classe-pai, essa necessidade
    //deixa de existir.
    protected String nome;
    protected double salario;

    @Override
    public void cidade() {
        System.out.println("Tatuí-SP");
    }

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void CBonus(); //Isso significa forçar a classe que for extendida
    //a aplicar esse método.
}
