package org.example.classes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
    //conforme for se inscrevendo, os cursos vão sendo salvos numa ordem;
    //vantagem do linkedhash é que ele só aceita itens únicos, então não há repetição, como haveria em um arraylist

    private Set<Conteudo> conteudosConcluido = new LinkedHashSet<>();

    public void inscreverNoBootcamp(Bootcamp bootcamp){
        this.conteudosInscrito.addAll(bootcamp.getConteudos());
        //pega tudo o que tem em bootcamp.getConteudos(); e adiciona em conteúdos inscritos;
        bootcamp.getDevInscritos().add(this);
        //nessa linha pegou todos os dev's inscritos e adicionou esse dev ao bootcamp.
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscrito.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluido.add(conteudo.get());
            this.conteudosInscrito.remove(conteudo.get());
        } else{
            System.err.println("Você não está matriculado em nenhum conteúdo, se inscreva em algum conteúdo");
        }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluido.stream().mapToDouble(conteudo -> conteudo.CalcularXP()).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscrito() {
        return conteudosInscrito;
    }

    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudosInscrito = conteudoInscrito;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudosConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudosConcluido = conteudoConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscrito, dev.conteudosInscrito) && Objects.equals(conteudosConcluido, dev.conteudosConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscrito, conteudosConcluido);
    }
}
