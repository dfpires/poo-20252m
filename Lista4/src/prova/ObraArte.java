package prova;
public class ObraArte {
    protected String titulo, artista;
    public ObraArte() {

    }
    public ObraArte(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "\nObraArte{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                this.descrever() +
                '}';
    }
    public String descrever() {
        return "Ainda não sei qual obra de arte eu sou";
    }

}
