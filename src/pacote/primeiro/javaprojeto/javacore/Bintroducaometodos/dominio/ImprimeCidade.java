package pacote.primeiro.javaprojeto.javacore.Bintroducaometodos.dominio;

public class ImprimeCidade {
    public void imprime (Cidade cidade){
        //É preciso ser cauteloso, pois se algo for mudado no objeto, ele terá essas alterações
        //permanentemente. Por exemplo, atribuir um valor 2 a um parâmetro x, fará com que ele
        //seja sempre 2.

        //Se ele for atribuído aqui, todos os valores serão impressos como 2.
        System.out.println(cidade.nome);
        System.out.println(cidade.populacao);
        System.out.println(cidade.estado);
        //Numa atribuição aqui, eventuais novas instâncias de um objeto seriam impressas como 2,
        //embora o valor possa ainda ser alterado.
        //Uma prática melhor seria criar uma nova instância do objeto na classe de exibição.
    }
}
