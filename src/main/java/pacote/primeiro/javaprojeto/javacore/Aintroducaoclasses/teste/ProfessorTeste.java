package pacote.primeiro.javaprojeto.javacore.Aintroducaoclasses.teste;

import pacote.primeiro.javaprojeto.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.idade = 57;
        professor.nome = "Astolfo";
        professor.sexo = 'M';
        System.out.println(professor.idade + professor.nome + professor.sexo);
    }
}
