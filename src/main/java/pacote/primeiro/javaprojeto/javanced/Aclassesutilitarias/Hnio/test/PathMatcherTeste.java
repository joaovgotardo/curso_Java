package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Hnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTeste {
    public static void main(String[] args) {
        Path path = Paths.get("pasta/arquivo.txt");
        Path path1 = Paths.get("pasta/arquivo.py");
        Path path2 = Paths.get("pasta/arquivo.java");
        matches(path, "glob:**.txt"); //Deve-se usar o metacaracter ** para trabalhar com diretorio
        matches(path1, "glob:**/*.{txt,py,java}"); //Para vários arquivos, faz-se o agrupamento
        //com {}, separados por vírgula e sem espaço.
        // **/* Significa que pode ser qualquer diretório, e qualquer nome.
        matches(path2, "glob:**/*.???"); //Cada ? significa um espaço de caracter que deve ser preenchido.
    }
    private static void matches(Path path, String glob){
        //glob é como uma regex, para arquivos e diretórios. É uma maneira facilitada de procurar.
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ":" + pathMatcher.matches(path));
    }
}
