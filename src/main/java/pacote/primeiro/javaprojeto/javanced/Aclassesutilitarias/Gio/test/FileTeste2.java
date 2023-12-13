package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Gio.test;

import java.io.File;
import java.io.IOException;

public class FileTeste2 {
    public static void main(String[] args) throws IOException {
        File arqDiretorio = new File("myFolder");
        boolean isMkdirC = arqDiretorio.mkdir(); //Através do método mkdir, que também é usado no linux
        //Cria-se uma pasta.
        System.out.println(isMkdirC); //Para criar um arquivo, pode-se:
        File arquivo = new File("C:\\Users\\jaovidro\\projetos_java\\curso_Java\\myFolder\\file.txt");
        boolean isArquivoC = arquivo.createNewFile();
        System.out.println(isArquivoC); //Ou:
        File arquivo2 = new File(arqDiretorio, "file2.txt");
        boolean isArquivo2C = arquivo2.createNewFile();
        System.out.println(isArquivo2C);

        //Para renomear um arquivo, deve-se também passar o diretório. Ex:
        File arquivo3 = new File(arqDiretorio, "renamed_file.txt");
        boolean isArquivoR = arquivo2.renameTo(arquivo3);
        System.out.println(isArquivoR);

        //Para renomear uma pasta, o processo é quase o mesmo.
        File arqDiretorio2 = new File("myFolder_Again");
        boolean isMkdirC2 = arqDiretorio.renameTo(arqDiretorio2);
        System.out.println(isMkdirC2);

    }
}
