package Exercicio3;

public class Tarefa implements Concluivel {

    // Atributos
    private String descricao;
    private boolean concluida;

    // Construtor
    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    @Override
    public void concluir() {
        concluida = true;
        System.out.println(descricao);
        System.out.println(concluida);
    }

    @Override
    public boolean estaConcluida() {
        return false;
    }
}
