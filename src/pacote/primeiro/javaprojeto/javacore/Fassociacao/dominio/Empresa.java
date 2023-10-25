package pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio;

public class Empresa {
    private String nome;
    private Funcionario[] funcionarios;

    public Empresa(String nome, Funcionario[] funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (funcionarios == null){
            System.out.println("Essa empresa não tem funcionários ainda");
        }for (Funcionario funcionario: funcionarios) {
                System.out.println(funcionario.getNome());
            }
        }

    public Empresa(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}
