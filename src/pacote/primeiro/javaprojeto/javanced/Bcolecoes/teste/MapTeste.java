package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import java.util.HashMap;
import java.util.Map;

public class MapTeste {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //O map recebe dois valores: o primeiro é a chave, o outro, o valor.
        //O HashMap irá exibir valores com base no seu valor Hash. Para exibir da maneira
        //convencional, deve-se usar o Linked.
        map.put("Cidade", "Passo Fundo");
        map.put("Estado", "Rio Grande do Sul");
        map.put("País", "Brasil");
        map.put("Continente", "Europa");
        map.put("Continente", "América"); //Se for colocada a mesma chave, o valor sobrescrito será o último adicionado.

        //Para imprimir as chaves:
        for (String k:map.keySet()) {
            System.out.println(k);
        }
        //Para imprimir os valores:
        for (String v:map.values()){
            System.out.println(v);
        }
        //Para imprimir ambos:
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
