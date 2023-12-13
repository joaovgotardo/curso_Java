package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

//e uma classe CamaroteSuperior, que é mais cara (possui
////valor adicional). Esta última possui um método para retornar o valor do ingresso. Ambas as
////classes herdam a classe VIP
public class Ex7_CamaroteSuperior extends Ex7_VIP{
    private double vad_Superior;
    public Ex7_CamaroteSuperior(double valor, double valor_adicional, double vad_Superior){
        super(valor, valor_adicional);
        this.vad_Superior = vad_Superior;
    }
    public void imprime_superior(double valor_Final, double valor_Superior) {
        super.imprime_VIP(valor_Final);
        valor_Superior = valor_Final + vad_Superior;
        System.out.println("Valor do Camarote Superior: R$" + valor_Superior);
    }

    public double getVad_Superior() {
        return vad_Superior;
    }

    public void setVad_Superior(double vad_Superior) {
        this.vad_Superior = vad_Superior;
    }
}

