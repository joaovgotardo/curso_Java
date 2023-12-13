package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

public class Ex10_ContaCorrente extends Ex10_Conta implements Ex10_Tributavel{
    private double numero_Conta;
    public Ex10_ContaCorrente(double saldo, int numero_Conta) {
        super(saldo);
        this.numero_Conta = numero_Conta;
    }

    @Override
    public double calculaTributos() {
        return saldo*0.01;
    }

    @Override
    public double sacar() {
        return saldo -= saque + calculaTributos();
    }

    @Override
    public double depositar() {
        return saldo += saque - calculaTributos();
    }

    @Override
    public void obterSaldo() {
        System.out.println("Número da Conta: " + numero_Conta);
        System.out.println("Saldo: R$" + saldo);
    }

    public double getNumero_Conta(){
        return numero_Conta;
    }

    public void setNumero_Conta(double numero_Conta){
        this.numero_Conta = numero_Conta;
    }
}
