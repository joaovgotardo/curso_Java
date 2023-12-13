package pacote.primeiro.javaprojeto.javanced.Jconcorrencia.dominio;


public class Desconto {
    public enum Perc{
        NENHUM(0), BAIXA_FIDELIDADE (5), MEDIA_FIDELIDADE(10), ALTA_FIDELIDADE(15),
        MISTER_CLIENTE(20);

        private final int porcentagem;

        Perc(int porcentagem) {
            this.porcentagem = porcentagem;
        }

        public int getPorcentagem() {
            return porcentagem;
        }
    }
}
