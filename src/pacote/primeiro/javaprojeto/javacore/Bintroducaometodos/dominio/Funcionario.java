package pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.dominio;

//Crie uma classe com os atributos
/*nome
* idade
* salário - três salários devem ser guardados */

//Crie os métodos
//Para imprimir os dados
//Tirar a média dos salários

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media = 0;
    public void media_salario(){
        if (salario == null){
            return;
        }
        for (double sal : salario) { //o loop percorre todos os valores do array
            media += sal; // à média são adicionados
        }
        media /= salario.length;
        System.out.println("Média Salarial: " + media);
    }

    public void imprimir(){
        if (salario == null){
            return;
        }
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
        for (double sal:salario) {
            System.out.print(sal + " | ");
        }
        media_salario();
        System.out.println("----------------");
    }
    //com o atalho alt+insert, pode-se criar um set automaticamente
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }
}
