package pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.teste;

import pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio.Pessoa;

public class BuilderPatternTeste {
    public static void main(String[] args) {
//        new Pessoa("Joao", "Gotardo", "jvgot", "jvitorgotardo@tutanota.com");
//        //O problema de um construtor com muitos argumentos, é que muitas vezes não se sabe
//        //o que cada um é.
        //Para montar uma instância com um builder:
        Pessoa build = new Pessoa.PessoaBuilder()
                .nome("Joao").sobrenome("Gotardo")
                .usuario("jvgot").email("jvitorgotardo@tutanota.com").build();
        //O PessoaBuilder retorna ele mesmo.
        System.out.println(build);
    }
}
