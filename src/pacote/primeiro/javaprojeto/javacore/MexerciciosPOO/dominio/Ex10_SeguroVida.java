package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

public class Ex10_SeguroVida extends Ex10_Conta implements Ex10_Tributavel{
    private int numero_Conta;
    public Ex10_SeguroVida(double saldo, int numero_Conta){
        super(saldo);
        this.numero_Conta = numero_Conta;
    }

    @Override
    public double calculaTributos(){
        return 42;
    }

    @Override
    public double sacar(){
        return saldo -= saque + calculaTributos();
    }
    @Override
    public double depositar() {
        return saldo += deposito - calculaTributos();
    }

    @Override
    public void obterSaldo(){
        System.out.println("Número da Conta: " + numero_Conta);
        System.out.println("Saldo: R$" + saldo);
    }

    public int getNumero_Conta(){
        return numero_Conta;
    }

    public void setNumero_Conta(int numero_Conta){
        this.numero_Conta = numero_Conta;
    }
}
