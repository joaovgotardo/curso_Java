package pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio;

public class Pessoa {
    //Padrões de projeto servem para resolver problemas comuns.
    //Builder
    private String nome;
    private String sobrenome;
    private String usuario;
    private String email;

    //O acesso em builder deixa o construtor privado.
    private Pessoa(String nome, String sobrenome, String usuario, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.usuario = usuario;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", usuario='" + usuario + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class PessoaBuilder {
        private String nome;
        private String sobrenome;
        private String usuario;
        private String email;
        //Quando um setter é criado, ele é void. No builder, o próprio builder é retornado.

        public static Pessoa.PessoaBuilder builder() {
            return new Pessoa.PessoaBuilder();
        }

        public PessoaBuilder nome(String nome){
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome){
            this.sobrenome = sobrenome;
            return this;
        }

        public PessoaBuilder usuario(String usuario){
            this.usuario = usuario;
            return this;
        }

        public PessoaBuilder email(String email){
            this.email = email;
            return this;
        }

        //Para criar uma classe Pessoa, e não PessoaBuilder.
        public Pessoa build(){
            return new Pessoa(nome, sobrenome, usuario, email);
        }
    }
    //Podem-se instalar plug-ins dentro do Intellij para criação automática do Builder.


    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
}
