package Entidades;

import java.time.LocalDate;

public class Professores {
    String nome;
    String materia;
    int matricula;
    LocalDate data;

    public Professores(String nome, String materia, int matricula, LocalDate data){
        this.nome = nome;
        this.materia = materia;
        this.matricula = matricula;
        this.data = LocalDate.now();

    }
    public String getNome(){
        return nome;
    }
    public String getMateria(){
        return materia;
    }
    public int getMatricula(){
        return matricula;
    }
    public LocalDate getData(){
        return data;
    }

    @Override
    public String toString() {
        return "Professores" +
                "Nome: " + nome  +
                ", Materia: " + materia +
                ", Matricula: " + matricula +
                ", Data: " + data +
                '.';
    }
}

