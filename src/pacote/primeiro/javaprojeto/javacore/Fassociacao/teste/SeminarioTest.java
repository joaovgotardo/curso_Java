package pacote.primeiro.javaprojeto.javacore.Fassociacao.teste;

import pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio.AAluno;
import pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio.ALocal;
import pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio.AProfessor;
import pacote.primeiro.javaprojeto.javacore.Fassociacao.dominio.ASeminario;

public class SeminarioTest {
    public static void main(String[] args) {
        ALocal local = new ALocal("Água Verde, Curitiba - PR");
        AAluno aluno1 = new AAluno("Joãozinho", 22);
        AAluno aluno2 = new AAluno("Pedrinho", 20);
        AAluno aluno3 = new AAluno("Duduzinho", 25);
        AAluno aluno4 = new AAluno("Mariazinha", 19);
        AAluno[] alunos1 = {aluno1, aluno2};
        AAluno[] alunos2 = {aluno3, aluno4};
        ASeminario seminario1 = new ASeminario("Lógica Paraconsistente", local, alunos1);
        ASeminario seminario2 = new ASeminario("Lógica Clássica", local, alunos2);
        ASeminario[] seminarios = {seminario1, seminario2};
        aluno1.setSeminario(seminario1); aluno2.setSeminario(seminario1);
        aluno3.setSeminario(seminario2); aluno4.setSeminario(seminario2);
        AProfessor professor = new AProfessor("Newton", "Matemática", seminarios);
        System.out.println("------"); local.imprimir(); System.out.println("------");
        aluno1.imprimir(); System.out.println("------"); aluno2.imprimir(); System.out.println("------");
        aluno3.imprimir(); System.out.println("------"); aluno4.imprimir(); System.out.println("------");
        seminario1.imprimir(); System.out.println("------"); seminario2.imprimir(); System.out.println("------");
        professor.imprimir();
    }
}
