package pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio;

public class RelatorioDto {
    //Data Transfer Object (DTO) - Um padrão arquitetural de aplicações corporativas.
    //Cria-se uma classe com os atributos desejados, o que pode incluir várias entidades diferentes.
    private String onibusNome;
    private Pais pais;
    private Moeda moeda;
    private String pessoaName;

    //Ao invés de criar vários objetos diferentes para serem passados a uma API, por exemplo,
    //o DTO faz com que haja um único.

    //Criação do builder
    public static final class RelatorioDtoBuilder {
        private String onibusNome;
        private Pais pais;
        private Moeda moeda;
        private String pessoaName;

        @Override
        public String toString() {
            return "RelatorioDtoBuilder{" +
                    "onibusNome='" + onibusNome + '\'' +
                    ", pais=" + pais +
                    ", moeda=" + moeda +
                    ", pessoaName='" + pessoaName + '\'' +
                    '}';
        }

        private RelatorioDtoBuilder() {
        }

        public static RelatorioDtoBuilder builder() {
            return new RelatorioDtoBuilder();
        }

        public RelatorioDtoBuilder onibusNome(String onibusNome) {
            this.onibusNome = onibusNome;
            return this;
        }

        public RelatorioDtoBuilder pais(Pais pais) {
            this.pais = pais;
            return this;
        }

        public RelatorioDtoBuilder moeda(Moeda moeda) {
            this.moeda = moeda;
            return this;
        }

        public RelatorioDtoBuilder pessoaName(String pessoaName) {
            this.pessoaName = pessoaName;
            return this;
        }

        public RelatorioDto build() {
            RelatorioDto relatorioDto = new RelatorioDto();
            relatorioDto.pessoaName = this.pessoaName;
            relatorioDto.onibusNome = this.onibusNome;
            relatorioDto.moeda = this.moeda;
            relatorioDto.pais = this.pais;
            return relatorioDto;
        }
    }
}
