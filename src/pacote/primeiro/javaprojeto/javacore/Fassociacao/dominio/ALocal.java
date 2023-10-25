package pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio;

public class ALocal {
    private String endereco;

    public void imprimir(){
        System.out.println("Endereço: " + this.endereco);
    }

    public ALocal(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
