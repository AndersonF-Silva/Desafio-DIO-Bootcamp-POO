import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao Curso JS");
        curso2.setCargaHoraria(8);

        Mentoria  mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descriçao do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAnderson = new Dev();
        devAnderson.setNome("Anderson Fernando");
        devAnderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Anderson: " + devAnderson.getConteudosInscritos());

        devAnderson.progredir();
        devAnderson.progredir();
        System.out.println("***");
        System.out.println("Conteudos Inscritos Anderson: " + devAnderson.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Anderson: " + devAnderson.getConteudosConcluidos());
        System.out.println("XP...: " + devAnderson.calcularTotalXp());

        System.out.println("=====================================");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao Victor");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("***");
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao: " + devJoao.getConteudosConcluidos());
        System.out.println("XP...: " + devJoao.calcularTotalXp());


    }
}
