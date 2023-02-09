package br.cursos.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        // criando curso
        Curso javaColecoes = new Curso("Dominando as coleções Java", "Paulo Silveira");
        // adicionando aulas dentro do curso, vamos usar o metodo adiciona que criamos
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
        javaColecoes.adiciona(new Aula("Utilizando estrutura de dados", 10));
        javaColecoes.adiciona(new Aula("Criando uma aula", 8));

        // vamos ordenar as aulas do curso em ordem alfabetica

        // pegando a List de Aula essa lista esta imutavel por causa da forma defensiva e não pode ser alterada
        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        // criando uma nova lista que não esta imutavel para fazer a ordenação
        // para adicionar as aulas abasta passar no construtor a lista de aulasImutaveis
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        // fazendo a ordenação
        Collections.sort(aulas);
        System.out.println(aulas);

        // agora queremos saber o total de tempo das aulas do curso - vamos criar o metodo na classe Curso
        // vamos usar o metodo getTempoTotal que criamos para fazer a soma do tempo das aulas do curso
        System.out.println(javaColecoes.getTempoTotal());

        // vamos transformar o objeto em string, formatação toString na classe Curso
        System.out.println(javaColecoes);




    }
}
