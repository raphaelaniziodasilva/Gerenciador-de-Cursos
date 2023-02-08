package br.cursos.alura;
// Aqui vamos trabalhar com relação de classe usando as coleções

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    // vamos fazer um relacionamento entre a classe Curso com a classe Aula
    // na classe Curso vai conter quais aulas pertencem aquele curso
    private List<Aula> aulas = new LinkedList<Aula>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    // feito o relacionamento entre as classes Curso e Aula agora temos acesso as aulas do curso
    // get de aulas para poder ter acesso as aulas fora da classe
    public List<Aula> getAulas() {
        return aulas;
    }
}
