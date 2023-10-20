package org.example.classes;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 100;
    //final é usado para criação de constantes.
    //static significa que é possível acessar o XP_PADRAO fora da classe conteúdo.

    private String titulo;
    private String descricao;

    public abstract double CalcularXP();
    // classe abstrata, não é possível instanciar o conteúdo dela.


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
