package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;
//Em seguida, crie uma classe que represente um departamento de uma empresa,
//registrando o nome e os funcionários que nele trabalham (para isso use um vetor,
// considere um máximo de 100 funcionários).

public class Ex1_Departamento {
    private String nome;
    private Ex1_Funcionario[] funcionarios;

    public Ex1_Departamento(String nome, Ex1_Funcionario[] funcionarios){
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public void imprimir(){
        System.out.println("Nome do Departamento: " + nome);
        if (funcionarios == null) return;
        for (Ex1_Funcionario funcionario:funcionarios) {
            System.out.println("Funcionário: " + funcionario.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ex1_Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Ex1_Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}
