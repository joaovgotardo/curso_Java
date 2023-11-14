package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

//b) Alguns bens são tributáveis e outros não, ContaPoupanca não é tributável, já
//para ContaCorrente você precisa pagar 1% da conta e o SeguroDeVida tem
//uma taxa fixa de 42 reais.
//c) As classes ContaCorrente e ContaPoupanca herdam de uma classe Conta. Essa
//classe Conta possui um saldo e os métodos sacar(double), depositar(double) e
//obterSaldo() que retorna o saldo da conta.
//d) Vamos criar uma classe TesteTributavel com um método main para testar o
//nosso exemplo.

public abstract class Ex10_Conta {
    protected double saldo;

    protected double saque;

    protected double deposito;

    public Ex10_Conta(double saldo){
        this.saldo = saldo;
    }

    //        return saldo -= saque;
    public abstract double sacar();

    public abstract double depositar();

    public abstract void obterSaldo();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
}
