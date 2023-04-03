import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        //System.out.println(curso2);
        //System.out.println(mentoria1);


        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);


        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Thiago : " + devThiago.getConteudosInscritos());
        System.out.println("Conteudos concluidos Thiago : " + devThiago.getConteudosConcluidos());
        devThiago.progredir();
        System.out.println("xp"+devThiago.calcularTotalXp());

        Dev devDanilo = new Dev();
        devDanilo.setNome("Danilo");
        devDanilo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Danilo : " + devDanilo.getConteudosInscritos());
        System.out.println("Conteudos concluidos Danilo : " + devDanilo.getConteudosConcluidos());



    }
}