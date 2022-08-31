package modelo;

import java.util.ArrayList;

public class User extends Pessoa {
    // Atributos
    private String email;
    private final ArrayList<Integer> telefone;
    private final ArrayList<Familiar> familiares;
    private ArrayList<String> emergencias;
    private static User uniqueInstance;
    
    // Métodos Getters e Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Integer> getTelefones() {
        return telefone;
    }
    
    public ArrayList<Familiar> getFamiliares() {
        return familiares;
    }

    public ArrayList<String> getEmergencias() {
        return emergencias;
    }
    
    // Construtor
    // Aqui usamos o Padrão Singleton para que exista apenas um User
    private User(){
        this.telefone = new ArrayList<>();
        this.familiares = new ArrayList<>();
    }
    
    public static synchronized User getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new User();
        return uniqueInstance;
    }
    
    // Outros Métodos
    public void addTelefone(int telefone){
        this.telefone.add(telefone);
    }
    
    public void addFamiliares(String nome, int telefone) {
        Familiar familiar = new Familiar(nome, telefone);
        this.familiares.add(familiar);
    }
    
    public void addEmergencia(String emergencias){
        this.emergencias.add(emergencias);
    }
}
