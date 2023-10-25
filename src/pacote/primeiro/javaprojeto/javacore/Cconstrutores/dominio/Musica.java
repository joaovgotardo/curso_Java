package pacote.primeiro.javaprojeto.javacore.Cconstrutores.dominio;

public class Musica {
    private String nome;
    private String artista;
    private String genero;
    private int ano;
    private String album;
    private String gravadora;

    //Os construtores são úteis para que atributos sejam usados obrigatoriamente.
    public Musica(String nome, String artista, String genero, int ano, String album){
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.ano = ano;
        this.album = album;
    }

    public Musica(String nome, String artista, String genero, int ano, String album, String gravadora){
        this(nome, artista, genero, ano, album);
        //O this só pode ser usado dessa forma em um construtor;
        this.gravadora = gravadora;
        //Pode-se haver sobrecarga de construtores;
    }

    //O Java permite que se faça a sobrecarga de métodos; eles têm o mesmo nome, porém podem ter
    //quantidade de parâmetros diferentes.
//    public void init(String nome, String artista, String genero, int ano){
//        this.nome = nome;
//        this.artista = artista;
//        this.genero = genero;
//        this.ano = ano;
//    }
//
//
//    public void init(String nome, String artista, String genero, int ano, String album){
//        this.init(nome, artista, genero, ano);
//        this.album = album;
//    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.artista);
        System.out.println(this.genero);
        System.out.println(this.ano);
        System.out.println(this.gravadora);
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setArtista(String artista){
        this.artista = artista;
    }
    public String getArtista(){
        return artista;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return genero;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }
}
