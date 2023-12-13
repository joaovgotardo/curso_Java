package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.E_resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste {
    public static void main(String[] args) {
        //O resourcebundle é útil para sistemas que precisam usar várias línguas.
        Locale localpadrao = Locale.getDefault();
        System.out.println(localpadrao);
        ResourceBundle bundle = ResourceBundle.getBundle("mensagem", new Locale("pt", "BR"));
//      boolean b = bundle.containsKey("existe"); //Verifica se o properties tem essa chave.
        System.out.println(bundle.getString("bem.vindo"));
        System.out.println(bundle.getString("capital"));
        System.out.println(bundle.getString("exception"));
        bundle = ResourceBundle.getBundle("mensagem", new Locale("de", "DE"));
//      Automaticamente, o Java pega as mensagens desse arquivo.
        System.out.println(bundle.getString("bem.vindo"));
        System.out.println(bundle.getString("capital"));
        //Preferência do Java (Locale: pais-LINGUA);
        //mensagem_pais-LINGUA > mensagem_LINGUA > mensagem_default_DEFAULT > mensagem_DEFAULT > mensagem
    }
}
