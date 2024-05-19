import br.com.dio.desafio.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev guga = new Dev();
        guga.setNome("Guga");
        guga.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos do Guga = " + guga.getConteudosInscritos());

        guga.progredir();
        guga.progredir();
        System.out.println("-");
        System.out.println("Conteúdos concluídos do Guga = " + guga.getConteudosConcluidos());
        System.out.println("Conteúdos incritos do Guga = " + guga.getConteudosInscritos());
        System.out.println("XP = " + guga.calcularTotalXp());

        System.out.println("--------------------");

        Dev joao = new Dev();
        joao.setNome("João");
        joao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos do João = " + joao.getConteudosInscritos());

        joao.progredir();
        joao.progredir();
        joao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos concluídos do João = " + joao.getConteudosConcluidos());
        System.out.println("Conteúdos incritos do João = " + joao.getConteudosInscritos());
        System.out.println("XP = " + joao.calcularTotalXp());



    }
}