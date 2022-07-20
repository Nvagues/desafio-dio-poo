package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main (String[] args){

    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("descricao curso java");
    curso1.setCargaHoraria(8);


    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("mentoria Java");
    mentoria.setDescricao("descricao mentoria java");
    mentoria.setData(LocalDate.now());

    System.out.println(curso1);
    System.out.println(mentoria);

    }
}
