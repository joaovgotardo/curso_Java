package pacote.primeiro.javaprojeto.javacore.MexerciciosPOO.dominio;

public class Ex9_Retangulo implements Ex9_AreaCalculavel{
    private double base;
    private double altura;
    public Ex9_Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calculaArea() {
        return base*altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
