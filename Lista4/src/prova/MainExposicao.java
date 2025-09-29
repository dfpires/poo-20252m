package prova;

public class MainExposicao {
    public static void main(String[] args) {
        Pintura p = new Pintura("Pintura 1", "Artista da pintura", "técnica da pintura");
        Escultura e = new Escultura("Escultura 1", "Artista da escultura", "material da escultura");
        Instalacao i = new Instalacao("Título da instalação", "Artista da instalação", true);

        Exposicao ex = new Exposicao("Comemoração 30 anos");
        ex.addObra(p);
        ex.addObra(e);
        ex.addObra(i);
        ex.removeObra("Escultura 1");
        System.out.println(ex.toString());

    }
}
