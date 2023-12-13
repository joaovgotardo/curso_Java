package pacote.primeiro.javaprojeto.javacore.Kinterfaces.dominio;

//As classes não usarão extends para lidar com interfaces, mas sim implements
public class CarregarBancoDados implements CarregarDados, RemoverDados{
    @Override
    public void carregar() {
        System.out.println("Carregando dados do banco");
    }
    @Override
    public void remover(){
        System.out.println("Removendo dados do banco");
    }
}
