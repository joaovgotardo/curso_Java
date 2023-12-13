package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

public class Ex9_Circulo implements Ex9_AreaCalculavel{
    private double raio;

    public Ex9_Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return raio*raio*3.141592653;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
