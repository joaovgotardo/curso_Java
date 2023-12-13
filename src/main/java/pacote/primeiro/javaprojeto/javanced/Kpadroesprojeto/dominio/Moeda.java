package pacote.primeiro.javaprojeto.javanced.Kpadroesprojeto.dominio;

public interface Moeda {
    String getMoeda();
}

class Real implements Moeda{
    @Override
    public String getMoeda() {
        return "R$";
    }
}

class USDollar implements Moeda{
    @Override
    public String getMoeda() {
        return "$";
    }
}

class SterlingPound implements Moeda{
    @Override
    public String getMoeda() {
        return "£";
    }
}