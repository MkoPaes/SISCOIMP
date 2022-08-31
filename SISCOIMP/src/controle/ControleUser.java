package controle;

import modelo.User;

public class ControleUser {
    public void manipulaUser(String nome, String endereco, String email, int telefone){
        User usuario = User.getInstance();
        usuario.setNome(nome);
        usuario.setEndereco(endereco);
        usuario.setEmail(email);
        usuario.addTelefone(telefone);
    }    
}
