package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

public class Ex9_Quadrado implements Ex9_AreaCalculavel{
    private double lado;

    public Ex9_Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado*lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
