package pacote.primeiro.javaprojeto.javacore.Eestaticos.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;
    // Um modificador static significa que o atributo está diretamente relacionado à classe carro,
    // e não a eventuais instâncias dele.
    //Uma única mudança em uma instância afetará todas.

    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println(" ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
        //this não faz sentido em statics, pois não haverá referência à instância e sim ao próprio objeto.
    // o this pode ser usado em estáticos aqui, pois ele é certo que existirá, pois não é estático
    }
    // o mesmo não é possível nesses dois próximos, pois são métodos estáticos.
    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
