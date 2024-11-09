import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(4);

        // Criando mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        // Criando bootcamp e adicionando cursos e mentoria
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Criando desenvolvedores
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos concluídos de João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP de João: " + devJoao.calcularTotalXp());

        System.out.println("------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("Conteúdos concluídos de Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP de Maria: " + devMaria.calcularTotalXp());
    }
}
