package pacote.primeiro.javaprojeto.javacore.Ienum.dominio;

public class Cliente1 {
    private String nome;
    private String tipo;

    //Muitas vezes, pode ser útil limitar os valores que instâncias de objetos dão aos atributos;
    public static final String P_FISICA = "P_FISICA";
    public static final String P_JURIDICA = "P_JURIDICA";

    public Cliente1(String nome, String tipo){
        //Se tipo não é igual às duas constantes, o objeto não será criado;
        //O método equals é usado para comparações com Strings.

        if(!tipo.equals(P_FISICA) && !tipo.equals(P_JURIDICA)){
            return;
        }
        this.nome = nome;
        this.tipo = tipo;
        //Embora essa seja uma forma válida de resolver o problema, existe outra mais útil: a enumeração.
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nome='" + nome + '\'' +
                ", Tipo='" + tipo + '\'' +
                '}';
    }
}
