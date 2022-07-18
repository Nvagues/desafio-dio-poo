package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.Curso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 =new Curso();
        curso1.setTítulo("curso java");
        curso1.setDescrição("descrição curso java");
        curso1.setCarga(8);

        Curso curso2 =new Curso();
        curso1.setTítulo("curso java");
        curso1.setDescrição("descrição curso java");
        curso1.setCarga(48);

        Mentoria mentoria = new Mentoria ();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescrição("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}