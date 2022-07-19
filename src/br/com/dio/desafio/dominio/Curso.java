package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int carga;

    @Override
    public double calcularXp(){
        return XP_APDRAO * carga;
    }

    public Curso(){

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
                "título='" + getTitulo() + '\'' +
                ", descrição='" + getDescrição() + '\'' +
                ", carga=" + carga +
                '}';
    }
}


