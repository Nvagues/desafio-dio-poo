package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devNatalia =new Dev();
        devNatalia.setNome("Natalia");
        devNatalia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Natalia:" + devNatalia.getConteudosInscritos());
        devNatalia.progredir();
        devNatalia.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Natalia:" + devNatalia.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Natalia:" + devNatalia.getConteudosConcluidos());
        System.out.println ("XP:"+ devNatalia.calcularTotalXp());

        System.out.println("-------");


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluídos Joao:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
    }
}
