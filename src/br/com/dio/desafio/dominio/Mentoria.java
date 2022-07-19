package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

        private LocalDate data;

    @Override
    public double calcularXp() {
        return 0;
    }
            return XP_PADRAO + 20d;

        public Mentoria(){


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescrição() + '\'' +
                ", data=" + data +
                '}';
    }
}
