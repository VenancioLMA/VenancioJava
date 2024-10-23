package Entidades;

import java.time.LocalDate;

public class Alunos {
    String nome;
    int matricula;
    int idade;
    LocalDate data;
    public Alunos(String nome, int matricula, int idade, int data){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.data = LocalDate.now();
    }
   public String getNome(){
        return nome;
   }
   public int getMatriculaget(){
        return matricula;

   }
   public int getIdade(){
        return idade;
   }
   public LocalDate getData(){
        return data;
   }

    @Override
    public String toString() {
        return "Aluno " +
                "Nome: " + nome +
                ", Matricula: " + matricula +
                ", Idade: " + idade + ", Data: " + data +
                ".";
    }
}

