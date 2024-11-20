public class musicas {
    private String faixa;
    private String titulo;
    private String artista;
    private String periodo;
    private String link;


    public musicas(String faixa, String titulo, String artista, String periodo, String link) {

        this.faixa = faixa;
        this.titulo = titulo;
        this.artista = artista;
        this.periodo = periodo;
        this.link = link;
    }

    // Getters e Setters
    public String getFaixa() {
        return faixa;
    }

    public void setFaixa(String faixa) {
        this.faixa = faixa;
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

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "faixa=" + faixa +
                ", titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", periodo='" + periodo + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}

