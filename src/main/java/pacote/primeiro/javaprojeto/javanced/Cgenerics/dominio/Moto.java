package pacote.primeiro.javaprojeto.javanced.Cgenerics.dominio;

public class Moto {
    private String moto;

    public Moto(String moto) {
        this.moto = moto;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "moto='" + moto + '\'' +
                '}';
    }

    public String getNome(){
        return moto;
    }
}
