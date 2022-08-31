package modelo;

public class Familiar {
    // Atributos
    private String nome;
    private int telefone;
    
    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    // Construtor
    public Familiar(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
}
