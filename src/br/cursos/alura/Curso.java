package br.cursos.alura;
// Aqui vamos trabalhar com relação de classe usando as coleções

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    // vamos fazer um relacionamento entre a classe Curso com a classe Aula
    // na classe Curso vai conter quais aulas pertencem aquele curso
    // inicializando a lista de aulas vazia
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
        // vamos usar uma forma defensiva para não deixar adicionar nehuma aula de outra jeito que agente estipulou
        // ou seja para adicionar uma aula tem que usar o metodo que agente criou
        // vamos usar Collections.unmodifiableList que não vai deixar nenhuma aula ser adicionado de outra forma
        return Collections.unmodifiableList(aulas);

        // Collections.unmodifiableList vai devolver uma lista parecida com a que temos porém so que vai servir para leitura
        // ou seja todos os mettodos que usarmos para modificar a lista ele não vai deixar ou remover adicionar etc...
    }

    // metodo que vai ser responsavel por somente adicionar as aulas
    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }
}
