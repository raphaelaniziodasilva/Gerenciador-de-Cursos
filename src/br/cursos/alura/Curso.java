package br.cursos.alura;
// Aqui vamos trabalhar com relação de classe usando as coleções

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    // vamos fazer um relacionamento entre a classe Curso com a classe Aula
    // na classe Curso vai conter quais aulas pertencem aquele curso
    // inicializando a lista de aulas vazia
    private List<Aula> aulas = new LinkedList<Aula>();
    // vamos fazer um relacionamento entre a classe Curso com a classe Aluno
    // na classe Curso e aonde vamos guardar todos os alunos matriculados
    // inicializando a lista de aulas vazia
    private Set<Aluno> alunos = new HashSet<>();

    // vamos verificar quem é o aluno que tem o determinado numero de matricula e usando o Map
    // o Map vai mapear dado um numero inteiro um Aluno correspondente no mapa HashMap
    // Map e HashMap são pocotes do java.util
    // criamos o mapa HashMap vazio vamos matricular os alunos nesse mapa. Vamos para o metodo de matriculas

    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();


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

    // somando o total de tempo das aulas do curso
    public int getTempoTotal() {
        int tempoTotal = 0;
        for (Aula aula: aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }

    // imprimindo, transformando objeto em string, formatação toString
    @Override
    public String toString() {
        return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + "," + " aulas: " + this.aulas + "]";
    }

    // feito o relacionamento entre as classes Curso e Aluno agora temos acesso dos alunos do curso
    // get de alunos para poder ter acesso dos alunos fora da classe
    public Set<Aluno> getAlunos() {
        // vamos usar a forma defensiva aonde não pode ser modificado por metodos que não esta na clase
        return Collections.unmodifiableSet(alunos);
    }

    // metodo que vai ser responsavel por somente matricular os alunos
    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        // vamos matricular os alunos no mapa HashMap que esta vazio
        // toda vez que alguém matricular um aluno além de adicionar vamos pegar o mapa
        // que se chama matriculaParaAluno e vou colocar uma relação entre o número de matricula desse aluno com ele mesmo
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);

        // para usar precisamos ir no metodo buscaMatriculado e retornar matriculaParaAluno.get
    }

    // verificando se o aluno esta matriculado
    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    //verificando quem é o aluno que tem o numero da matricula exemplo: 1210 usando o map
    public Aluno buscaMatriculado(int numero) {
        // verificando se o numero da matricula existe se não existir vai lançar um erro se existir passa direto e devolve um aluno
        if(!matriculaParaAluno.containsKey(numero)) {
            throw new NoSuchElementException("Matricula não encontrada");
        }
        // vai devolver o aluno que tem o numero da matricula
        return matriculaParaAluno.get(numero);
    }

    /**
     * primeira forma
     * // verificando quem é o aluno que tem o numero da matricula exemplo: 1210
     *     public Aluno buscaMatriculado(int numero) {
     *         for (Aluno aluno: alunos) {
     *             if(aluno.getNumeroMatricula() == numero) {
     *                 return aluno;
     *             }
     *         }
     *         throw new NoSuchElementException("Matricula não encontrada" + numero);
     *     }
     *
     *     A segunda forma para verificar quem é o aluno que tem a tal matricula e usando o Map
     *     para isso precisamos declarar o atributo Map no começo da classe
     *
     */

}
