package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Hnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles2 extends SimpleFileVisitor<Path>{

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    //PreVisitDirectory: Ele é invocado para um diretório antes que ele seja visitado.
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("preVisit: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
        //skipsubtree - Vai pular todas as subpastas.
        //skipsiblings - Vai pular todas as pastas do mesmo nível.
    }

    //Usado para falhas de entradas de arquivos.
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    //PosVisitDirectory: Ele é invocado para um diretório após ele ser visitado.
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("PostVisit: " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}
public class SimpleFileVisitorTeste2 {
    public static void main(String[] args) throws IOException {
        Path raiz = Paths.get("arquivos");
        Files.walkFileTree(raiz, new ListAllFiles2());
    }

}
