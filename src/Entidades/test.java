package Entidades;

import java.time.LocalDate;

public class test {
    public static void main(String[] args) {
        Alunos alunos = new Alunos("Joao",123,6,LocalDate.now());
        System.out.println(alunos);
        Professores professor = new Professores("Manoel", "Portugues", 123, LocalDate.now());
        System.out.println(professor);
        Turma turma = new Turma("Portugues", 1, 1, LocalDate.now());
        System.out.println(turma);

    }


}
