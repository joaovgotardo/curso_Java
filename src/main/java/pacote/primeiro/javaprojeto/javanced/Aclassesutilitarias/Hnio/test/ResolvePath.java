package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Hnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvePath {
    public static void main(String[] args) {
        //Resolve do path: Junta dois caminhos separados.
        Path diretorio = Paths.get("home/joao");//Caminho relativo.
        // /home/joao -> é um caminho absoluto.
        Path arquivo = Paths.get("dev/arquivo2.txt");
        Path resolve = diretorio.resolve(arquivo);
        System.out.println(resolve);

        //Se misturarmos absoluto e relativo, o resolve não tem a mesma eficácia.
        Path absoluto = Paths.get("/home/joao");
        Path relativo = Paths.get("dev");
        System.out.println(absoluto.resolve(relativo));
        System.out.println(relativo.resolve(absoluto)); //Se partirmos a partir do relativo, o resolve erra.
        //Por isso, geralmente o arquivo a ser colocado é o absoluto completo, embora seja útil saber isso.
    }
}
