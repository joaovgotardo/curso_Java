package pacote.primeiro.javaprojeto.javanced.Bcolecoes.teste;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTeste {
    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<>();
        navigableMap.put("São Paulo", "Campinas");
        navigableMap.put("Rio Grande do Sul", "Caxias do Sul");
        navigableMap.put("Bahia", "Ilhéus");
        navigableMap.put("Santa Catarina", "Joinville");
        navigableMap.put("Minas Gerais", "Uberaba");

        for (Map.Entry<String, String> entry: navigableMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(navigableMap.headMap("Santa Catarina").remove("Minas Gerais"));
        //Retorna quem está antes dessa chave no map.
        System.out.println(navigableMap); //Agora sem uma das chaves.
        //Os métodos do Navigable também estão disponíveis.
        System.out.println(navigableMap.lowerKey("Santa Catarina"));
    }
}
