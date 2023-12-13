package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Hnio.test;

//Usando SimpleFileVisitor e PathMatcher, retorne todos os arquivos já feitos, que tenham
//'Teste' no nome, e terminem ou com .class ou .java.

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class Visitor extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)  {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}");
        Path verf = file.getFileName();
        if (verf.toString().endsWith(".class") || (verf.toString().endsWith(".java"))){
            if (pathMatcher.matches(file)){
                System.out.println(file.getFileName());
            }
        }
        return FileVisitResult.CONTINUE;
    }
}
public class PathMatcherTeste2 {
    public static void main(String[] args) throws IOException{
        Path path = Paths.get(".");
        Files.walkFileTree(path, new Visitor());
    }
}
