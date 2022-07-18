package br.com.dio.desafio.dominio;

public class Curso {
    private String título;
    private String descrição;
    private int carga;

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "título='" + título + '\'' +
                ", descrição='" + descrição + '\'' +
                ", carga=" + carga +
                '}';
    }
}


