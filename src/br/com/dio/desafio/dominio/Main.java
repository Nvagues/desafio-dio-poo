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

        Bootcamp bootcamp =new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDevsInscritos("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNatalia = new Dev();
        devNatalia.setNome("Natalia");
        devNatalia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devNatalia.getConteudosInscritos());
        devNatalia.progredir();
        devNatalia.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devNatalia.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devNatalia.getConteudosConcluidos());
        System.out.println("XP:" + devNatalia.calcularTotalXp());

        System.out.println("-");

        Dev devJoao =new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}