package pacote.primeiro.javaprojeto.javacore.Aintroducaoclasses.teste;

import pacote.primeiro.javaprojeto.javacore.Aintroducaoclasses.dominio.Aluno;

//Classe *nome de variável* - Cria uma variável para instanciar a classe referida;
//new Classe() - Chama a classe.
public class AlunoTeste { //Classe criada para testar a classe pessoa
    public static void main(String[] args) {
        Aluno pessoa = new Aluno(); //pessoa é uma variável de referência; new é usado para criar objetos.
        Aluno outra = new Aluno(); //Outra variável de referência pode ser criada, utilizando os atributos da classe para outro objeto;
        pessoa.idade = 17; pessoa.nome = "Carlos"; pessoa.sexo = 'M';

        outra.idade = 14; outra.nome = "Maria"; outra.sexo = 'F';
        System.out.println(pessoa.idade + "\n" + pessoa.nome + "\n" + pessoa.sexo);
        System.out.println(outra.idade + "\n" + outra.nome + "\n" + outra.sexo);

        pessoa = outra; //Pode-se referenciar uma instância de classe em outra; contudo, os valores
        //originais de outra se perderiam, com essa instância passando a ter o mesmo valor de pessoa.
    }
}
