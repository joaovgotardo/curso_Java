package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Hnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest {
    public static void main(String[] args) {
        //Relativize: a partir de dois paths, como chegar do path2 até o path1?
        Path path = Paths.get("/home/joao");
        Path archive = Paths.get("/home/joao/dev/dev2/arquivo_novo.txt");
        System.out.println(path.relativize(archive));

        Path absol = Paths.get("/home/joao");
        Path absol2 = Paths.get("/user/this");
        Path absol3 = Paths.get("/home/joao/dev/dev2/arquivo_novo.txt");
        Path rel = Paths.get("temporary");
        Path rel2 = Paths.get("temporary/temp1/temp.archive");

        System.out.println(absol3.relativize(absol));
        System.out.println(absol.relativize(absol2)); //Voltar duas pastas e mudar de diretório.
        System.out.println(rel.relativize(rel2));
        //Se tentarmos ir de um absoluto para um relativo, uma exceção é lançada, pois o Java não
        //sabe como chegar a essa pasta.
    }
}
