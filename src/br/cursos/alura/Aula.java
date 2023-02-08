package br.cursos.alura;

// para podermos usar o metodo compareTo precisamos implementar Comparable<Aula>
// implementando o Comparable<Aula> estamos dizendo para a classe Aula que ela pode ser comparavel com outra <Aula>
public class Aula implements Comparable<Aula>{
    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    // transformando um objeto para string usando o mtodo toString
    @Override
    public String toString() {
        return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    }

    @Override
    public int compareTo(Aula outraAula) {
        // vamos usar o titulo para fazer a comparação
        return this.titulo.compareTo(outraAula.titulo);
    }
}
