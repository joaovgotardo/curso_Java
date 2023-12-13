package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Hnio.test;

import java.nio.file.Paths;
import java.nio.file.Path;

public class NormalizeTeste {
    public static void main(String[] args) {
        String diretorio = "home/joao/dev";
        String arquivo = "../../arquivo.txt";
        Path path = Paths.get(diretorio, arquivo);
        //Se isso for executado, o path retornará, ao invés de home/joao/arquivo.txt, uma sequência.
        System.out.println(path);
        //O normalize corrige isso, retornando onde o arquivo está localizado.
        System.out.println(path.normalize());
        //Se uma sintaxe diferente, como a do Linux for usada, a normalização também ocorre.
        Path path2 = Paths.get("home/./joao/./dev");
        System.out.println(path2.normalize());
    }
}
