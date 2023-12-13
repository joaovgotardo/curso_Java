package pacote.primeiro.javaprojeto.javanced.Ithreads.dominio;

public class Conta {
    private int saldo = 100;

    public void saque(int quantia){
        this.saldo = this.saldo - quantia;
    }

    public int getSaldo() {
        return saldo;
    }
}
