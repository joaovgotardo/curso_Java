package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;
//crie uma classe CamaroteInferior (que possui a localização do ingresso e métodos para
//acessar e imprimir esta localização) e uma classe CamaroteSuperior, que é mais cara (possui
//valor adicional). Esta última possui um método para retornar o valor do ingresso. Ambas as
//classes herdam a classe VIP*/
public class Ex7_CamaroteInferior extends Ex7_VIP{
    private String localizacao;
    public Ex7_CamaroteInferior (double valor, double valor_adicional, String localizacao){
        super(valor, valor_adicional);
        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao(){
        System.out.println("Localização: " + localizacao);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
