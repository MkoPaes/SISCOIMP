package modelo;

public class zzTestes {
    public static void main(String[] args) {
        
        User usuario = User.getInstance();
        usuario.setNome("Fulano");
        usuario.setEndereco("Rua B");
        usuario.setEmail("teste2@gmail.com");
        usuario.addTelefone(988887777);
        usuario.addFamiliares("Arroz", 99999999);
        usuario.addFamiliares("Feijao", 88888888);
        usuario.addFamiliares("Batata", 77777777);
        usuario.addFamiliares("Macarrao", 66666666);
        System.out.println("Nome: "+usuario.getNome()+"\nEndereco: "+usuario.getEndereco()+"\nEmail: "+usuario.getEmail());
        for (int i = 0; i < usuario.getFamiliares().size(); i++) {
            System.out.println(usuario.getFamiliares().get(i).getTelefone());
        }
        for (int i = 0; i < usuario.getTelefones().size(); i++) {
            System.out.println(usuario.getTelefones().get(i));
        }
        
        /*
        Profissional a = new Profissional();
        a.setNome("Fulano");
        a.setEndereco("Rua B");
        System.out.println("Nome: "+a.getNome()+"\nEndereco: "+a.getEndereco());
        */
    }
}
