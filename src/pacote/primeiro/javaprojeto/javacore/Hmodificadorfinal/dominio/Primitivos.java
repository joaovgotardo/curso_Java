package pacote.primeiro.javaprojeto.javacore.Hmodificadorfinal.dominio;

//Final impede que outras classes sejam subclasses de Primitivos
//Isso é útil para evitar que outras subclasses modificam o conteúdo dos métodos.
public final class Primitivos {
    private String nome;
    public final double VELOCIDADE_LIMITE = 250;
    //O modificador final é usado para constantes.
    //A constante, por convenção, é digitada em uppercase e seus espaços separados por underline.

    public final Referencia REFERENCIA = new Referencia();
    //Isso significa que a referência só poderá ser feita nessa instância;
    //Ela em si pode receber outros valores, porém, final Referencia indica que referenciará somente um objeto.

    public Primitivos(String nome){
        this.nome = nome;
    }

    //Nos métodos, isso significa que ele jamais poderá ser sobrescrito.
    public final void imprimir(){
        System.out.println(this.nome);
    }
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}
