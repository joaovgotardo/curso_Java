package pacote.primeiro.javaprojeto.javacore.Nexcecoes.exceptions.teste;

import pacote.primeiro.javaprojeto.javacore.Nexcecoes.exceptions.dominio.ErroLoginException;

import java.util.Scanner;

public class ErroLoginExceptionTeste {
    //A boa prática indica que essa exceção seja tratada.
    public static void main(String[] args) {
        try{
            login();
        }catch (ErroLoginException e){
            e.printStackTrace();
        }
    }

    //É preciso declarar no início do método, pois não é Runtime.
    private static void login() throws ErroLoginException {
        String coruser = "Adamantium";
        String corpassw = "7750510a";
        Scanner t = new Scanner(System.in);
        System.out.println("Digite seu nome de usuário: ");
        String user01 = t.nextLine();
        System.out.println("Digite sua senha: ");
        String senha_U01 = t.nextLine();
        if(!user01.equals(coruser) || !senha_U01.equals(corpassw)){
            throw new ErroLoginException("Usuário inválido");
        }else{
            System.out.println("Login efetuado com sucesso.");
        }
    }
}
