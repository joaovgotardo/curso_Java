package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Hnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class BasicFilesAttributesTeste2 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("myFolder_Again/path.txt");
        BasicFileAttributes bFA = Files.readAttributes(path, BasicFileAttributes.class);
        //Isso quer dizer que o atributo que deve ser retornado é da classe BasicFileAttributes.
        //O BasicFile vai na verdade, criar um arquivo com base no sistema operacional.
        FileTime creation = bFA.creationTime();
        FileTime lastAccess = bFA.lastAccessTime();
        FileTime lastModified = bFA.lastModifiedTime();
        System.out.println(creation);
        System.out.println(lastAccess);
        System.out.println(lastModified);
        //Alguns atributos a serem impressos.

        //Para modificar um atributo, classes que permitem isso são (classe)View. BasicFile,
        //DosFile e PosixFile são read-only.
        BasicFileAttributeView fav = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        fav.setTimes(lastModified, lastAccess, FileTime.from(Instant.now()));
        System.out.println(fav.readAttributes().creationTime());
        System.out.println(fav.readAttributes().lastAccessTime());
        System.out.println(fav.readAttributes().lastModifiedTime());
    }
}
