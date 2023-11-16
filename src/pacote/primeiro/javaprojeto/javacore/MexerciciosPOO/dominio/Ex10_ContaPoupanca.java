package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

public class Ex10_ContaPoupanca extends Ex10_Conta{
    private int numero_conta;
    public Ex10_ContaPoupanca(double saldo, int numero_conta){
        super(saldo);
        this.numero_conta = numero_conta;
    }

    @Override
    public double sacar() {
        return saldo -= saque;
    }

    @Override
    public double depositar() {
        return saldo += deposito;
    }

    @Override
    public void obterSaldo() {
        System.out.println("Número da Conta: " + numero_conta);
        System.out.println("Saldo: R$" + saldo);
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }
}
