package pacote.primeiro.javaprojeto.javanced.Bcolecoes.dominio;

public class Computador {
    private String serial;
    private String marca;
    private int ram_cap;

    public Computador(String serial, String marca, int ram_cap) {
        this.serial = serial;
        this.marca = marca;
        this.ram_cap = ram_cap;
    }

    //Reflexivo - x.equals(x) é true para tudo diferente de null.
    //Simétrico - para x e y != de null, se x.equals(y) == true, logo y.equals(x) == true
    //Transitividade - para x, y e z != null, se x.equals(y) == true, e x.equals(z) == true, logo y.equals(z) == true
    //Consistente - x..equals(x) sempre retorna true se x
    //para x diferente de null, x.equals(null) deve retornar falso.
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false; //Objeto não pode ser nulo.
        if(this == obj) return true; //Objeto deve ser o this.
        if(this.getClass() != obj.getClass()) return false; //Se a classe for diferente entre this e obj, é falso.
        Computador computador = (Computador) obj;
        return serial != null && serial.equals(computador.serial); //Se serial não é nulo, serial é igual ao serial do obj.
    }

    //HashCode é como um código associado a um valor em um array por exemplo, para procurá-lo
    //mais facilmente. Uma coleção tem em seus elementos hashs associados à eles.
    //Se dois valores têm o mesmo hash, o Java retorna o valor corresponde pelo equals.

    //se x.equals(y), x.hashCode() == y.hashCode()
    //y.hashCode() == x.hashCode() não necesseriamente y.equals(x) seja True.
    //y.hashCode != x.hashCode(), então x.equals(y) será false.
    @Override
    public int hashCode() {
        if(serial == null) ;
        return serial == null ? 1 : this.serial.hashCode();
    }

    //O toString é necessário para que a impressão dele seja o do valor, e não posição de memória.
    @Override
    public String toString() {
        return "Computador{" +
                "serial='" + serial + '\'' +
                ", marca='" + marca + '\'' +
                ", ram_cap=" + ram_cap +
                '}';
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRam_cap() {
        return ram_cap;
    }

    public void setRam_cap(int ram_cap) {
        this.ram_cap = ram_cap;
    }
}
