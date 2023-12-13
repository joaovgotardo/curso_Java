package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Hnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

class listAllFiles extends SimpleFileVisitor<Path>{
    //Definindo o generics que vão agir como um 'invocador' do método.


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if(file.getFileName().toString().endsWith(".java")){
            System.out.println(file.getFileName());
        }
        //A execução do método ocorre por ação do Java, o que é preciso é colocar o
        //retorno.
        //        String regex = "[(a-zA-Z0-9\\._\\-)]+.java";
//        Pattern compile = Pattern.compile(regex);
//        Matcher matcher = compile.matcher(path.toString());
//
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }
        return FileVisitResult.CONTINUE;
    }
}
public class SimpleFileVisitorTeste {
    public static void main(String[] args) throws IOException {
        //O walkFileTree passa por uma "árvore" de arquivos, a partir de um arquivo dado.
        Path raiz = Paths.get(".");
        Path path = Files.walkFileTree(raiz, new listAllFiles());
        //Precisa de um fileVisitor
    }

}
