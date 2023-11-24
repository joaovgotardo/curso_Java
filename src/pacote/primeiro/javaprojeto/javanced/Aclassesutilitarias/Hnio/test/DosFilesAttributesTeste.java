package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Hnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFilesAttributesTeste {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("myFolder_Again/teste.txt");
        if (Files.notExists(path)) Files.createFile(path);
        //Deve-se seguir o padrão do Windows.
//        Files.setAttribute(path, "dos:hidden", true);
//        Files.setAttribute(path, "dos:readonly", true);
//
//        Files.setAttribute(path, "dos:hidden", false);
//        Files.setAttribute(path, "dos:readonly", false);
        DosFileAttributes dfa = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dfa.isHidden());
        //Para modificá-lo, é preciso usar o View
        DosFileAttributeView dfa2 = Files.getFileAttributeView(path, DosFileAttributeView.class);
        dfa2.setHidden(false);

        System.out.println(Files.isHidden(path));
    }
}
