package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Iserializacao.test;

import pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Iserializacao.dominio.Aluno;
import pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Iserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SerializacaoTeste {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Aluno aluno = new Aluno("1", "Nicolau Santos", "310931");
        Turma turma = new Turma("2G");
        aluno.setTurma(turma); //O que acontece na serialização de uma associação?
        serializar(aluno);
        System.out.println("Você deseja desserializar o arquivo agora?");
        String confirmar = s.next();
        if(confirmar.equals("S") || confirmar.equals("s")){
            desserializar();
            //O construtor não é executado no momento da desserialização.
        }
    }
    //Serialização: Pegar um objeto em memória e persisti-lo, em um arquivo por exemplo.
    //Muito usado por frameworks.
    //Serializar é como transformar um objeto em um 'array de bytes'.
    //InputStream - Para entrada.
    //OutputStream - Para ler o que foi entrado. Como ObjectOutputStream

    //Passa para código de máquina.
    private static void serializar(Aluno aluno){
        Path path = Paths.get("serialization/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){ //Cria um novo arquivo para o objeto serializado.
            oos.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void desserializar(){
        Path path = Paths.get("serialization/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){ //Cria a desserialização do objeto..
            Aluno aluno = (Aluno) ois.readObject(); //Cria-se um cast para que
            //o Java saiba qual objeto será lido. Lança exceção.
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}