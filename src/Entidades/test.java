package Entidades;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Alunos> alunos = new ArrayList<>();
        while(true) {
            System.out.println("Digite o nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.println("Digite a data de nascimento do aluno: ");
            String dataNascimento = scanner.nextLine();
            System.out.println("Digite a matricula do aluno: ");
            int matricula = Integer.parseInt(scanner.nextLine());
            Alunos aluno = new Alunos("M", 1, 15, 10/10/2024);
            alunos.add(aluno);

        }

// Vou precisar adicionar um objeto que recebar o Aluno e tenha como criar um aluno2 que tenha os mesmo parametros que os anteriorer
    }
}