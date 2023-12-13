package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Hnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste {
    public static void main(String[] args) {
        //No pacote nio, foram criadas novos objetos para lidar com arquivos:
        //Path (interface), que substitui File. Paths (classe), de onde Path vem.
        //E Files, que pega os métodos que File usava antes.
        Path p1 = Paths.get("C:\\Users\\jaovidro\\projetos_java\\curso_Java\\file2.txt");
        //Também pode-se pegar o arquivo através de um varargs:
        Path p2 = Paths.get("C:\\Users\\jaovidro\\projetos_java\\curso_Java", "file2.txt");
        System.out.println(p1.getFileName().toFile().toPath());
        //O paths pega o arquivo, depois o transformando para um path.
    }
}
