package br.cursos.alura;

public class TestaCurso {
    public static void main(String[] args) {
        // criando curso
        Curso javaColecoes = new Curso("Dominando as coleções Java", "Paulo Silveira");
        // adicionando aulas dentro do curso, vamos usar o metodo adiciona que criamos
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
        javaColecoes.adiciona(new Aula("Utilizando estrutura de dados", 10));
        javaColecoes.adiciona(new Aula("Criando uma aula", 8));

        // usamos a forma defensiva que não vai permitir que a aula seja adicionado dessa forma a aula so sera adicionado
        // usando o metodo que agente criou na classe
        //javaColecoes.getAulas().add(new Aula("Não vai funcionar", 5));

        // pegando a aula adicionada e imprimindo
        System.out.println(javaColecoes.getAulas());

    }
}
