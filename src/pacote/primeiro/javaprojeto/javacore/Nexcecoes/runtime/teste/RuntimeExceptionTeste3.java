package pacote.primeiro.javaprojeto.javacore.Nexcecoes.runtime.teste;

public class RuntimeExceptionTeste3 {
    public static void main(String[] args) {
}
    private static String conexao(){
        try{
            System.out.println("Abrindo mídia");
            throw new RuntimeException();
            //System.out.println("Adicionando dados à mídia");
        }catch(Exception e){
            e.printStackTrace();
        }finally { //Um bloco de código que sempre será executado.
            System.out.println("Fechando mídia");
        }//Com isso, o fechamento da mídia será feito independentemente de uma exceção ocorrer.
        return null;
    }
}
