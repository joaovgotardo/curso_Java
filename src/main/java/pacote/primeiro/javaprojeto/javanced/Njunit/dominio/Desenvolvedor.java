package pacote.primeiro.javaprojeto.javanced.Njunit.dominio;

public class Desenvolvedor extends Funcionario {
    private String frameworkPrincipal;
    public Desenvolvedor(String id, String frameworkPrincipal){
        super(id);
        this.frameworkPrincipal = frameworkPrincipal;
    }

    public String getFrameworkPrincipal() {
        return frameworkPrincipal;
    }
}
