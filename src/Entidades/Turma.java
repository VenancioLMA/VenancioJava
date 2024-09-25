package Entidades;

import java.time.LocalDate;

public class Turma {
    String materia;
    int numero;
    int andar;
    LocalDate data;

    public Turma(String materia, int numero, int andar, LocalDate data){
        this.materia = materia;
        this.numero = numero;
        this.andar = andar;
        this.data = data;

    }
    public String getMateria(){
        return materia;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getAndar(){
        return andar;
    }
    public void setAndar(int andar){
        this.andar = andar;
    }
    public LocalDate getData(){
        return data;
    }
    public void setData(LocalDate data){
        this.data = data;
    }

    @Override
    public String toString() {
        return "Turma: " +
                "Materia: " + materia +
                ", Numero Da Sala: " + numero +
                ", Andar: " + andar  + " Data: " + data +
                '.';
    }
}
