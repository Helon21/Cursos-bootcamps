package org.example;

import org.example.classes.Bootcamp;
import org.example.classes.Curso;
import org.example.classes.Dev;
import org.example.classes.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("bootcamp de java com spring");
        curso.setDescricao("Esse curso parece ser muito bom");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Teste de instanciação da mesma classe numa variável nova");
        curso2.setDescricao("Descrição do curso 2");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em java");
        mentoria.setDescricao("Descrição da mentoria em java");
        mentoria.setData(LocalDate.now());

        //isso é só um exemplo.
        //List<String> palavras = new ArrayList<>();
        //tudo o que tem em list tem em array list, mas nem tudo o que tem em array list tem em list
        //instanciar array list a partir da classe list já é um polimorfismo
        //instanciar algo a partir de outra classe, uma classe mãe.

        //System.out.println(curso);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp para aprender Java e Springboot");
        bootcamp.setDescricao("Se aprimore em Java e no framework springboot");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHelon = new Dev();
        devHelon.setNome("Helon");
        devHelon.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devHelon.getConteudoInscrito());

        devHelon.progredir();

        System.out.println("----");

        System.out.println("Conteúdos ainda Inscrito" + devHelon.getConteudoInscrito());
        System.out.println("Conteúdos Concluídos" + devHelon.getConteudoConcluido());
        System.out.println("XP" + devHelon.calcularTotalXp());

        System.out.println("--------");

        Dev devEmily = new Dev();
        devEmily.setNome("Emily");
        devEmily.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devEmily.getConteudoInscrito());

        devEmily.progredir();
        devEmily.progredir();
        devEmily.progredir();

        System.out.println("----");

        System.out.println("Conteúdo ainda inscrito" + devEmily.getConteudoInscrito());
        System.out.println("Conteúdos Concluídos" + devEmily.getConteudoConcluido());
        System.out.println("XP" + devEmily.calcularTotalXp());
    }


}