package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;
//Por fim, crie uma classe que representa uma empresa,
//registrando seu nome, CNPJ e departamentos (considere um máximo de 10 departamentos).
public class Ex1_Empresa {
    private String nome;
    private int cnpj;
    private Ex1_Departamento[] departamentos;

    public Ex1_Empresa(String nome, int cnpj, Ex1_Departamento[] departamentos){
        this.nome = nome;
        this.cnpj = cnpj;
        this.departamentos = departamentos;
    }

    public void imprimir(){
        System.out.println("Nome da Empresa: " + nome);
        System.out.println("CNPJ: " + cnpj);
        if (departamentos == null) return;
        for (Ex1_Departamento departamento : departamentos) {
            System.out.println("Departamento: " + departamento.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public Ex1_Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Ex1_Departamento[] departamentos) {
        this.departamentos = departamentos;
    }
}
