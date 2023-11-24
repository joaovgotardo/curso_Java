package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Iserializacao.dominio;

import java.io.*;

public class Aluno implements Serializable { //Ou seja, o arquivo é serializável.
    private static final long serialVersionUID = 1401061146153302861L;
    private String id;
    private String nome;
    private transient String password;
    //Transient significa que o atributo não será serializado. Quando o arquivo for executado,
    //ele lançará uma exceção de SerializableClass without SerialUID; se resolvida, obriga
    //a classe que o tem a implementar um ID.
    private final static String ESCOLA = "ESCOLA_NOVA_ESPERANCA";
    //Estáticos não são serializados, pois não pertencem ao objeto.
    private transient Turma turma;

    @Override
    public String toString() {
        return "Aluno{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", escola='" + ESCOLA + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }

    public Aluno(String id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    //Serializando uma associação:
    private void writeObject(ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome()); //Aqui não está sendo serializado, mas simplesmente
            //escrevendo o nome do arquivo.
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    private void readObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            String s = ois.readUTF();//Aqui não está sendo serializado, mas simplesmente
//escrevendo o nome do arquivo.
            turma = new Turma(s);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        //Turma não foi serializada; mas a String que representa a turma sim.
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
